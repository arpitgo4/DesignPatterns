package builderPattern;

/**
 * Created by arpit on 19/2/16.
 */
public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza(){
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildTopping();
    public abstract void buildSauce();
}
