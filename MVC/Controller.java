import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller {

    // Reference to the view and the model
    private Model model;
    private View view;

    // Constructor
    public Controller (Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Method run
    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String exit = reader.readLine().toLowerCase();
            if (exit.equals("exit")) {
                break;
            }
            int num = Integer.parseInt(exit);
            int number = num;
  
            number = modelEx.yourNum();
            viewEx.printNum(num);
            viewEx.printText2();
        }
    }
}
