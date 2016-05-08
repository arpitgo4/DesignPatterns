package builderPattern;

/**
 * Created by arpit on 19/2/16.
 */
public class HawaiianPizza extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("mild");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("ham + pineapple");
    }
}
