import java.net.*;
import java.io.*;
import java.io.BufferedReader;

public class HttpUrlConnection {
    public static void main(String[] args) throws Exception{
        try{
            URL Link = new URL("http://www.facebook.com");
            HttpURLConnection conn = (HttpURLConnection) 
            Link.openConnection();
            
            conn.setRequestMethod("GET");
            
            BufferedReader reader = new BufferedReader(new InputStreamReader
            		(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();
            
            System.out.println("Response: " + conn.getContentType());

            if(conn.getContentType() != null){
                System.out.println("Success!");
            }
            else{
                System.out.println("Connection failed");
            }
        }
        catch(IOException e)
        {
            System.err.format("Error: \n", e);
        }
    }
}
