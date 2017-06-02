package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JsonSimpleReadExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		//parse file and taken as object
		JSONObject obj=  (JSONObject) parser.parse(new FileReader("D:/Users/Suggala.vasa/workspace1/json/src/jsontxt.json"));
		getKeyValue(obj,"paths");
		getPath(obj,"paths");
		printJsonObject(obj,"paths");
		saveFile(obj,"definitions");
	}
	static String getKeyValue(JSONObject obj , String key){
		try {
			JSONObject jsonObject=obj;
			System.out.println(jsonObject.get(key));//basing on key value
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;

	}

	static String getPath(JSONObject obj , String key){
		try {
			JSONObject posts = (JSONObject) obj.get(key);
			System.out.println(posts.keySet());//for getting list of "paths"
		} catch (Exception e) {
			e.printStackTrace();
		}
		return key;

	}

	static void printJsonObject(JSONObject jsonObj,String keys) {
		JSONObject keyvalue = (JSONObject)jsonObj.get(keys);
		//for nested objects iteration if required
		if (keyvalue instanceof JSONObject){
			printJsonObject(keyvalue, keys);

			System.out.println("key: "+ keys + " value: " + keyvalue); //Print key and value
		}
	}
	public static void saveFile(JSONObject obj,String keys)
			throws IOException {
		try{

			JSONObject posts = (JSONObject) obj.get(keys);
			// loop to get the dynamic key
			Set<String> primeKeys = posts.keySet();
			//changes set to String array
			String a[]= primeKeys.toArray(new String[primeKeys.size()]);
			for(int i = 0; i <a.length; i++) {
				//converting array to String
				String abc=a[i].toString();
				// path for output file
				FileWriter outFile = new FileWriter("D:/Users/Suggala.vasa/workspace1/json/src/pet/"+abc+".json");
				PrintWriter out = new PrintWriter(outFile);
				JSONObject keyvalue1 = (JSONObject) posts.get(abc);
				//to print in the file
				out.println(keyvalue1);
				out.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

