package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("CIRCLE")) return new Circle();
        else if(shape.equalsIgnoreCase("RECTANGLE")) return new Rectangle();
        else return new NullShape();
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
