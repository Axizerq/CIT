import java.util.HashMap;

public class fContr {
    public static HashMap<Integer, Handler> films = new HashMap<Integer, Handler>();

    public static void put(int film){
    	films.put(1, new TheOscar_2008());
    	films.put(2, new TheOscar_2010());

        Handler handler = films.get(film);
        handler.execute(film);
    }
}