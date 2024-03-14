package mongo;
import java.util.*;

import org.bson.Document;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.*;

public class javamongo {

	public static void main(String[] args) {

		MongoClient mongo = new MongoClient("localhost", 27017);
		System.out.println("Connection created successfully");

		MongoCredential credential;
		credential = MongoCredential.createCredential("vaibhav", "shop", "password".toCharArray());
		System.out.println("Connected to the database successfully");

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("shop");
		System.out.println("Credentials ::" + credential);

		// Creating a collection
//	      database.createCollection("sampleCollection"); 
//	      System.out.println("Collection created successfully"); 

		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("products");
		System.out.println("Collection products selected successfully");

		Document document1 = new Document("title", "MongoDB")
				.append("description", "database").append("likes", 100)
				.append("url", "http://www.tutorialspoint.com/mongodb/")
				.append("by", "tutorials point");
		Document document2 = new Document("title", "RethinkDB")
				.append("description", "database")
				.append("likes", 200)
				.append("url", "http://www.tutorialspoint.com/rethinkdb/")
				.append("by", "tutorials point");

		List<Document> list = new ArrayList<Document>();
		list.add(document1);
		list.add(document2);
		
		// Inserting document into the collection
		collection.insertMany(list);
		System.out.println("Document inserted successfully");
		// Getting the iterable object
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		// Getting the iterator
		Iterator it = iterDoc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}

	}
}
