package crudOperations;
import static java.util.Arrays.asList;
import java.util.ArrayList;
import java.util.Collection;
import org.bson.Document;
import com.mongodb.Block;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
public class EmployeeCRUDOperations {
    public static void main(String[] args) {
        // Creating mongo client default connection host:localhost port:12027
        MongoClient mongoClient = new MongoClient();
        // fetching a database with name students
        MongoDatabase db = mongoClient.getDatabase("employee");
        // fetching collection scores from database students
        MongoCollection collection = db.getCollection("training");
        //find one record
        findFailedStud(collection);
        
        //failed employees in aggregate (term1+term2+term3)
        failedInAggregate(collection);
        
        //average score of trainees in term1
        averageScoreTerm1(collection);
        
        //Average score of class for aggregate (term1 + term2 + term3)
        averageClassScore(collection);
        
        //count of employee failed in all three terms
        employeeCountFailInAlLTerms(collection);
        
        //count of employee failed in either of three terms
        employeeCountFailAtleastATerm(collection);
                
    }
    private static void employeeCountFailAtleastATerm(MongoCollection collection) {
        Long count=collection.count(new Document("$or",asList(new Document("results.0.score",new Document("$lt",37)), new Document("results.1.score",new Document("$lt",37)),new Document("results.2.score",new Document("$lt",37)))));
        System.out.println("Count of employees failing in either of the terms : " + count);
        
    }
    private static void employeeCountFailInAlLTerms(MongoCollection collection) {
        Long count=collection.count(new Document("results.0.score",new Document("$lt",37)).append("results.1.score",new Document("$lt",37)).append("results.2.score",new Document("$lt",37)));
System.out.println("Count of employees failing in all terms : " + count);
    }
    private static void averageClassScore(MongoCollection collection) {
        
        Collection<Document> employees = collection.aggregate(asList(new Document("$unwind","$results"),new Document("$group", new Document("_id","$name").append("Average", new Document("$avg","$results.score"))))).into(new ArrayList<Document>());
        for(Document doc:employees){
            System.out.println("Average score of trainees for aggregate (term1+ term2 + term3) : " + doc.toJson());
        }    
    }
    private static void averageScoreTerm1(MongoCollection collection) {
        Collection<Document> employees = collection.aggregate(asList( new Document("$unwind","$results"), new Document("$match",new Document("results.evaluation","term1")),new Document("$group",new Document("_id",null).append("Average", new Document("$avg","$results.score"))))).into(new ArrayList<Document>());
        for(Document doc:employees){
            System.out.println("Average score of trainees for term1 : " + doc.toJson());
        }    
        
    }
    private static void failedInAggregate(MongoCollection collection) {
        
        Collection<Document> employees = collection.aggregate(asList(new Document("$unwind","$results"),new Document("$group", new Document("_id","$name").append("total", new Document("$sum","$results.score"))),new Document("$match", new Document("total",new Document("$lt",111))))).into(new ArrayList<Document>());
        for(Document doc:employees){
            System.out.println("employees who failed in aggregate (term1+ term2 + term3) : " + doc.toJson());
        }
    }
        
    /**
     * function to find a record input : mongodb collection
     */
    public static Long findFailedStud(MongoCollection<Document> collection) {
        Long count = collection.count(new Document("results.evaluation", "term1").append("results.score", new Document("$lt",37)));
        
        Long totalStudents=collection.count();
        Long per_Stud=(count*100/totalStudents);
        System.out.println("Number of students failed in exams : passing marks 37 : " + count);
        System.out.println("Percentage of students failed in exams : passing marks 37 : " + per_Stud +" %");
        return per_Stud;
                
    }
}