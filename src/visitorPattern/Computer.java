package visitorPattern;

/**
 * Created by arpit on 21/2/16.
 */
public class Computer implements ComputerPart {

    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{
                new Mouse(), new Keyboard(), new Monitor()
        };
    }

    @Override
    public void doAccept(ComputerPartVisitor computerPartVisitor) {
        for(ComputerPart part : parts)
            part.doAccept(computerPartVisitor);
        computerPartVisitor.visit(this);
    }
}
