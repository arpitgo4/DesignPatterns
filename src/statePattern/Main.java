package statePattern;

/**
 * Created by arpit on 12/2/16.
 */

/**
 * In State pattern a class behavior changes based on its state. This type of design
 * pattern comes under behavior pattern.
 *
 * In State pattern, we create objects which represent various states and a context
 * object whose behavior varies as its state object changes.
 */

public class Main {

    public static void main(String[] args){
        System.out.println("State Pattern \n");
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println("Context's State : " + context.getState());
        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println("Context's State : " + context.getState());
    }

}
