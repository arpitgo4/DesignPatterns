package bridgePattern;

/**
 * Created by arpit on 12/2/16.
 */

/**
 * Bridge is used when we need to decouple an abstraction from its implementation
 * so that the two can vary independently. This type of design pattern comes under
 * structural pattern as this pattern decouples implementation class and abstract
 * class by providing a bridge structure between them.
 *
 * This pattern involves an interface which acts as a bridge which makes the
 * functionality of concrete classes independent from interface implementer classes.
 * Both types of classes can be altered structurally without affecting each other.
 */
public class Main {

    public static void main(String[] args){
        Shape circle = new Circle(1,2,10,new GreenCircle());
        circle.draw();

        Shape circle1 = new Circle(10, 20, 100, new RedCircle());
        circle1.draw();
    }

}
