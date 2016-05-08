package builderPattern;

/**
 * Created by arpit on 19/2/16.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("Pan Baked");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("hot");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("pepperoni + salami");
    }
}
