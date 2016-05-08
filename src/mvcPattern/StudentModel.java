package mvcPattern;

/**
 * Created by arpit on 11/2/16.
 */
public class StudentModel {

    private String name;
    private int rollno;

    public StudentModel(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
