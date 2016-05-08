package proxyPattern;

/**
 * Created by arpit on 10/2/16.
 */
public class RealImage implements Image {

    String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName + " Image From Disk");
    }
}
