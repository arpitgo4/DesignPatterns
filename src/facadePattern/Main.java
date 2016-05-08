package facadePattern;

/**
 * Created by arpit on 10/2/16.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Facade Pattern");

        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSqaure();
    }

}
