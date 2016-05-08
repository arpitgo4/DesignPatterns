package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public class NullFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return new NullShape();
    }

    @Override
    public Color getColor(String color) {
        return new NullColor();
    }
}
