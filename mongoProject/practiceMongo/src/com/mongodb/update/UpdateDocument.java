package com.mongodb.update;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
public class UpdateDocument {
    public static void main(String[] args) {
        // To connect to the mongoDB server
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // Now connect to your database
        DB db = mongoClient.getDB("test");
        System.out.println("Connection to the database successful.");
        DBCollection collection = db.getCollection("java_item");
        System.out.println("Collection items selected successfully.");
        BasicDBObject updateDocument = new BasicDBObject();
        updateDocument.append("$set", new BasicDBObject().append("likes", 200));
        BasicDBObject query = new BasicDBObject().append("title", "MongoDB");
        collection.update(query, updateDocument, false, true);
        System.out.println("Document updated successfully.");
        mongoClient.close();
    }
}