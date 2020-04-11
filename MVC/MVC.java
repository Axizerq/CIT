import java.io.IOException;

public class MVC {

    public static void main(String[] args) throws IOException {
        // model
        Model model = new Model();
        // view
        View view = new View(model);
        // Pass to Controller
        new Controller(model, view).run();  
    }
}
