package com.mongodb.gridfs;
import java.io.File;
import java.io.IOException;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
public class UploadFile {
    public static void main(String[] args) throws IOException {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("sample");
        String newFileName = "gridFS-java-image";
       // File imageFile = new File("C:\\Users\\shipra\\Desktop\\instrument pictures\\gitar.jpg");
        // create a "photo" namespace
        GridFS gfsPhoto = new GridFS(db, "photo");
        // get image from local drive
        //GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
        // set the new file name for identity
       // gfsFile.setFilename(newFileName);
        // save the image file to mongoDB
       // gfsFile.save();
        // print the result
        DBCursor cursor = gfsPhoto.getFileList();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }
        // get the image file by it's filename
        GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
        // save it to a new image file
        imageForOutput.writeTo("C:\\Users\\shipra\\Desktop\\instrument pictures\\gitar.jpg");
        System.out.println("Done");
        // Remove the file.
        //gfsPhoto.remove(gfsPhoto.findOne(newFileName));
        // close the connection
        mongoClient.close();
    }
}
