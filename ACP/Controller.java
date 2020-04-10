import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        fContr controller = new fContr();

        try {
            System.out.println("What the list you want to see?");
            System.out.println("1 - The Oscar 2008");
            System.out.println("2 - The Oscar 2010");

            int film = Integer.parseInt(read.readLine());
            controller.put(film);
        }
        catch (Exception e){
            System.out.println("Wrong input!");
            int film = Integer.parseInt(read.readLine());
            controller.put(film);
        }
    }
}