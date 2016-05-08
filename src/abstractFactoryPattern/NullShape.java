package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public class NullShape implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape Not Found");
    }
}
