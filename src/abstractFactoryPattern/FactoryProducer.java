package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String factory) {
        if(factory.equalsIgnoreCase("SHAPE")) return new ShapeFactory();
        else if(factory.equalsIgnoreCase("COLOR")) return new ColorFactory();
        else return new NullFactory();
    }

}
