package factoryPattern;

/**
 * Created by arpit on 31/1/16.
 */
public class Bills extends God {

    public Bills() {
        setName("Lord Bills");
        setPowerLevel(1000000000);
    }

    @Override
    String getspecialMove() {
        return "Destroy Everything";
    }
}
