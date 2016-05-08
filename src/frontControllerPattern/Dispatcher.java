package frontControllerPattern;

/**
 * Created by arpit on 11/2/16.
 */
public class Dispatcher {

    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT"))
            studentView.show();
        else if(request.equalsIgnoreCase("HOME"))
            homeView.show();
    }
}
