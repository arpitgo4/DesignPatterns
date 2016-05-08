package facadePattern;

/**
 * Created by arpit on 10/2/16.
 */
public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    void drawCircle(){
        circle = new Circle();
        circle.draw();
    }

    void drawSqaure(){
        square = new Sqaure();
        square.draw();
    }

    void drawRectangle(){
        rectangle = new Rectangle();
        rectangle.draw();
    }

}
