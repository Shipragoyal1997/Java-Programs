package com.mongodb.insert;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class InsertDocuments {
    public static void main(String[] args) {
        // To connect to the mongoDB server
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        // Now connect to your database
        MongoDatabase db = mongoClient.getDatabase("test");
        System.out.println("Connection to the database successful.");
        MongoCollection<Document> collection = db.getCollection("java_item");
        System.out.println("Collection item selected successfully.");
        Document document = new Document("title", "MongoDB").append("description", "database").append("likes", 100);
        collection.insertOne(document);
        System.out.println("Document inserted successfully.");
        mongoClient.close();
    }
}