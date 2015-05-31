package database;

import address.Contact;

import com.couchbase.client.java.*;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

public class ClusterConnector {
private Cluster cluster;
private Bucket bucket;

public ClusterConnector(String ipAddress){
	cluster = CouchbaseCluster.create(ipAddress); // initial connection to the server cluster based on the input IP address
}
public void openBucket(String bucketName,String password){
	bucket = cluster.openBucket(bucketName, password); // opens the the Data bucket/database on the cluster based on the DB name and  pass credentials
}
public void disconnectConnector(){
	cluster.disconnect(); 
}
public JsonObject createJsonObject(Contact contact){
	JsonObject jObj = JsonObject.empty(); //parses the contact information into Json
	jObj.put("firstname", contact.getFirstName()).put("lastname",contact.getLastName())
	.put("email", contact.getEmail()).put("address", contact.getAddress()); // puts the attributes into a List thats contained with the JSON object
     return jObj;
}
public JsonDocument createJsonDocument(JsonObject jsonObject){
	
	return JsonDocument.create(jsonObject.getString("firstname") +jsonObject.getString("lastname"), jsonObject);	// returns JsonObject as a Single String.
}
public void upload(JsonDocument jsonObject){
	 if((bucket.async().upsert(jsonObject)) == null){  // if the value of the JsonDocument return from the upsert is null then the data cannot be push to the server.Otherwise its .
		 System.out.println("Error:Cannot upload the data to the server.");
	 }
	 System.out.println("Upload successful.");
}

}
