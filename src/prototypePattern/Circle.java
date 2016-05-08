package prototypePattern;

/**
 * Created by arpit on 7/2/16.
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
