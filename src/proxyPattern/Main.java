package proxyPattern;

/**
 * Created by arpit on 10/2/16.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Proxy Pattern");
        Image image = new ProxyImage("myPic.jpg");
        image.display();

    }

}
