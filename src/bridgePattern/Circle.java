package bridgePattern;

/**
 * Created by arpit on 12/2/16.
 */
public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int raduis, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = raduis;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x, y, radius);
    }
}
