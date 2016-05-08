package prototypePattern;

/**
 * Created by arpit on 7/2/16.
 */
public abstract class Shape implements Cloneable {

    String type;
    String id;

    public String getShapeId(){
        return id;
    }

    public String getShapeType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public abstract void draw();
}
