package builderPattern;

/**
 * Created by arpit on 19/2/16.
 */
public class Pizza {

    private String dough;
    private String sauce;
    private String topping;

    public String getDough() {
        return dough;
    }

    @Override
    public String toString() {
        return "Pizza : \n" + "Dough : " + getDough() + "\nTopping : " + getTopping()
                + "\nSauce : " + getSauce();
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
