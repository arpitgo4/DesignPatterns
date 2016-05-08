package prototypePattern;


/**
 * Created by arpit on 7/2/16.
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
