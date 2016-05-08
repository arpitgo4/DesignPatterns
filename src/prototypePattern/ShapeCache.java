package prototypePattern;

import java.util.HashMap;

/**
 * Created by arpit on 7/2/16.
 */
public class ShapeCache {

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        if(cacheShape != null)
            return (Shape) cacheShape.clone();
        else return null;
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getShapeId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getShapeId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getShapeId(), rectangle);
    }

}
