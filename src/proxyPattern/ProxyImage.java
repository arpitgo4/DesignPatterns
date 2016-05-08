package proxyPattern;

/**
 * Created by arpit on 10/2/16.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) realImage = new RealImage(fileName);
        realImage.display();
    }
}
