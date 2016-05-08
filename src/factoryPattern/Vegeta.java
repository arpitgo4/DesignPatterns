package factoryPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Vegeta extends God {

    public Vegeta() {
        setName("Vegeta");
        setPowerLevel(10000);
    }

    @Override
    String getspecialMove() {
        return "Power Bombs";
    }
}
