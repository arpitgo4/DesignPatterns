package flyweightPattern;

import java.util.HashMap;

/**
 * Created by arpit on 11/2/16.
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public Shape getCircle(String color){
        Shape circle = (Circle) circleMap.get(color);

        if(circle != null){
            System.out.println("Old Circle Returned");
            return circle;
        }
        else {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("New Circle Created");
            return circle;
        }
    }

}
