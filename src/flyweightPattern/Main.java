package flyweightPattern;

/**
 * Created by arpit on 11/2/16.
 */
public class Main {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle = (Circle) shapeFactory.getCircle("Red");
        shapeFactory.getCircle("Yellow");
        shapeFactory.getCircle("Red");
        circle.draw();
    }

}
