

import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

public class JsonSimpleReadExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONObject obj=  (JSONObject) parser.parse(new FileReader("D:/Users/Suggala.vasa/workspace1/json/src/jsontxt.json"));
		printJsonObject(obj,"paths");
		Json(obj,"paths");
	}
	public  static void printJsonObject(JSONObject jsonObj,String keys) {
		try{
			Object keyvalue = jsonObj.get(keys);
			if (keyvalue instanceof JSONObject){
				System.out.println("key: "+ keys+"\n"); //Print key and value
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void Json(JSONObject obj,String keys){
		JSONObject posts = (JSONObject) obj.get(keys);
		Iterator a = posts.keySet().iterator();
		while(a.hasNext()) {
			String key = (String)a.next();
			// loop to get the dynamic key
			System.out.print("key : "+key+"\n");

		}
	}
}