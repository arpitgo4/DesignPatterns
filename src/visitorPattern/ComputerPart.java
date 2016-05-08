package visitorPattern;

/**
 * Created by arpit on 21/2/16.
 */
public interface ComputerPart {

    void doAccept(ComputerPartVisitor computerPartVisitor);

}
