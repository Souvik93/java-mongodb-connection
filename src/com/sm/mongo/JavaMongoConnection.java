package com.sm.mongo;

import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class JavaMongoConnection {
	public static void main(String args[])
	{
		//Connecting With Server Please add the external jar file first
				MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
				System.out.println("server connection successfully done");
				
				//Connecting with database
				MongoDatabase dbs = mongoClient.getDatabase("test");
		        System.out.println("Connect to database successfully");
		        System.out.println("Database Name"+dbs.getName());
		        
		        // To get all database names
				List<String> dbNames=mongoClient.getDatabaseNames();
		        System.out.println(dbNames);
		        
		      //Drop Database
		        
		        mongoClient.dropDatabase("newDb");
		        dbNames=mongoClient.getDatabaseNames();
		        System.out.println(dbNames);
		
		
	}

}
