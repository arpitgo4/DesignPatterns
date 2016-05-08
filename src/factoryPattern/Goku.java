package factoryPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Goku extends God {

    public Goku() {
        setName("Goku");
        setPowerLevel(10000);
    }

    @Override
    String getspecialMove() {
        return "Kame-hame-haa";
    }
}
