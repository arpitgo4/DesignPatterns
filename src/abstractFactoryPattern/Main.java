package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories. This type of design pattern comes
 * under creational pattern as this pattern provides one of the best ways to create an object.
 *
 * In Abstract Factory pattern an interface is responsible for creating a factory of
 * related objects without explicitly specifying their classes. Each generated factory can
 * give the objects as per the Factory pattern.
 */
public class Main {

    public static void main(String[] args){
        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory shapeFactory = factoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = factoryProducer.getFactory("COLOR");

        Shape shape = shapeFactory.getShape("SQUARE");
        Color color = colorFactory.getColor("YELLOW");

        shape.draw();
        color.fill();
    }

}
