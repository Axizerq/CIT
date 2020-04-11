import java.io.IOException;

public class MVC {

    public static void main(String[] args) throws IOException {
        // model
        ModelEx model = new Model();
        // view
        ViewEx view = new View(model);
        // Pass to Controller
        new Controller(model, view).run();  
    }
}
