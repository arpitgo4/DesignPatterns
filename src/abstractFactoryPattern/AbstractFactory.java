package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);

}
