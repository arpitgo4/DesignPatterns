package visitorPattern;

/**
 * Created by arpit on 21/2/16.
 */
public class Main {

    public static void main(String[] args){
        ComputerPart computer = new Computer();
        computer.doAccept(new ComputerPartDisplayVisitor());
    }

}
