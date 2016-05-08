package abstractFactoryPattern;

/**
 * Created by arpit on 12/2/16.
 */
public class NullColor implements Color {

    @Override
    public void fill() {
        System.out.println("Filling Unknown Color");
    }
}
