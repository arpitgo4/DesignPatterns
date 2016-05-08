package statePattern;

/**
 * Created by arpit on 12/2/16.
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Starting....");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
