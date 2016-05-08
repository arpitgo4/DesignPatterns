package bridgePattern;

/**
 * Created by arpit on 12/2/16.
 */
public class GreenCircle implements  DrawAPI {

    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Green Circle with (" + x +
                "," + y + ") radius : " + radius);
    }
}
