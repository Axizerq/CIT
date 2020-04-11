import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class Main {
    public static void main(String[] args){
        try {
            JSONParser Parser = new JSONParser();
            JSONObject iJson = (JSONObject) Parser.parse(new FileReader("JS.json"));
            
            System.out.println("JSON: \n" + iJson + "\n");
            
            iJson.put("Galaxies");
            
            System.out.println("Modified JSON: \n" + iJson);
            
            System.out.println("\nLoad JSON:");
            System.out.println("First galaxy: " + iJson.get("firstG"));
            System.out.println("Second galaxy: " + iJson.get("secondG"));
            System.out.println("Third galaxy: " + iJson.get("thirdG));
            System.out.println("Fourth galaxy: " + iJson.get("fourthG"));
        } 
        catch (IOException | ParseException e) {
        }
    }
}
