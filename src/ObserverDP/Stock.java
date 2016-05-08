package ObserverDP;

/**
 * Created by arpit on 31/1/16.
 */
public class Stock {

    private String name;
    private float value;

    public Stock(String name, float value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getName().equals(((Stock)obj).getName()))
            return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }
}
