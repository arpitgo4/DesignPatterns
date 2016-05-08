package frontControllerPattern;

/**
 * Created by arpit on 11/2/16.
 */
public class FrontController {

    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private boolean isAuthenticUser(){
        System.out.println("User is Authenticated Successfully");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested : " + request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);
        if(isAuthenticUser())
            dispatcher.dispatch(request);
    }
}
