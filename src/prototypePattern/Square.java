package prototypePattern;

/**
 * Created by arpit on 7/2/16.
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}
