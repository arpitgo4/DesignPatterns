package visitorPattern;

/**
 * Created by arpit on 21/2/16.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void doAccept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
