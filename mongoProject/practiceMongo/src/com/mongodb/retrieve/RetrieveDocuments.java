package com.mongodb.retrieve;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
public class RetrieveDocuments {
    
    public static void main(String[] args) {
        // To connect to the mongoDB server
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // Now connect to your database
        DB db = mongoClient.getDB("test");
        System.out.println("Connection to the database successful.");
        DBCollection collection = db.getCollection("items");
        System.out.println("Collection items selected successfully.");
        DBCursor cursor = collection.find();
        int index = 1;
        while (cursor.hasNext()) {
            System.out.println("Inserted document: " + index);
            System.out.println(cursor.next());
            index++;
        }
        System.out.println("Documents retrieved successfully.");
        mongoClient.close();
    }
}
