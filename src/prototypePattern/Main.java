package prototypePattern;

/**
 * Created by arpit on 7/2/16.
 */
public class Main {

    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape cloneShape = ShapeCache.getShape("1");
        cloneShape.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("3");
        clonedShape3.draw();

    }

}
