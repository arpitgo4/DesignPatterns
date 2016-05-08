package visitorPattern;

/**
 * Created by arpit on 21/2/16.
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);
    void visit(Keyboard keyboard);
    void visit(Mouse mouse);
    void visit(Monitor monitor);
}
