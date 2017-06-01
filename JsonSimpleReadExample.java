

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonSimpleReadExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
    	JSONParser parser = new JSONParser();
    	JSONObject obj=  (JSONObject) parser.parse(new FileReader("D:/Users/Suggala.vasa/workspace1/json/src/jsontxt.json"));
    getKeyValue(obj,"paths");
    }
        static String getKeyValue(JSONObject obj , String key){
        try {
        	JSONObject jsonObject=obj;
            //System.out.println(jsonObject);
            System.out.println(jsonObject.get(key));

        } catch (Exception e) {
            e.printStackTrace();
        }
		return key;

    }
}