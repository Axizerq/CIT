import java.net.*;
import java.io.*;

public class HttpUrlConnection {
    public static void main(String[] args) throws Exception{
        try{
            URL Link = new URL("http://www.google.com");
            HttpURLConnection conn = (HttpURLConnection) 
            Link.openConnection();

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