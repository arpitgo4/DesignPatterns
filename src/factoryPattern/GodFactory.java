package factoryPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class GodFactory {

    public static GodFactory instance = null;

    public static GodFactory getInstance(){
        if(instance == null) instance = new GodFactory();
        return instance;
    }

    private GodFactory() {}

    public static God createGod(String name){
        if(name.equals("Goku")) return new Goku();
        else if(name.equals("Vegeta")) return new Vegeta();
        else return new Bills();
    }

}
