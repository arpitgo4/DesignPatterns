package builderPattern;

/**
 * Created by arpit on 19/2/16.
 */

/**
 * Builder pattern builds a complex object using simple objects and using a step by
 * step approach. This type of design pattern comes under creational pattern as this
 * pattern provides one of the best ways to create an object.
 *
 * A Builder class builds the final object step by step. This builder is independent
 * of other objects.
 */

public class Main {

    public static void main(String[] args){
        System.out.println("Builder Pattern");

        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizza = new HawaiianPizza();
        PizzaBuilder spicyPizza = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizza);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
    }

}
