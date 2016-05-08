package statePattern;

/**
 * Created by arpit on 12/2/16.
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Stopping....");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
