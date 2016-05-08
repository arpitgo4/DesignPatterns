package singleton;

/**
 * Created by arpit on 31/1/16.
 */
public class Singleton {

    private static Singleton firstInstance = null;
    private static String name = null;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(){
        if(firstInstance == null) firstInstance = new Singleton("first");
        return firstInstance;
    }

    public static String getName() {
        return name;
    }
}
