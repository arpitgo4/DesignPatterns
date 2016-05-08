package factoryPattern;

/**
 * Created by arpit on 31/1/16.
 */
public abstract class God {

    private String name;
    private double powerLevel;

    abstract String getspecialMove();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }
}
