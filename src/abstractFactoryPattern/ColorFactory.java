package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color.equalsIgnoreCase("RED")) return new Red();
        else if(color.equalsIgnoreCase("BLUE")) return new Blue();
        else return new NullColor();
    }
}
