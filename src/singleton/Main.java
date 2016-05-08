package singleton;

/**
 * Created by arpit on 31/1/16.
 */
public class Main {

    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getName());
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getName());
    }


}
