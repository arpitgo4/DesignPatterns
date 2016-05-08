package mvcPattern;

/**
 * Created by arpit on 11/2/16.
 */
public class StudentController {

    StudentModel studentModel;
    StudentView studentView;

    public StudentController(StudentModel studentModel, StudentView studentView) {
        this.studentModel = studentModel;
        this.studentView = studentView;
    }

    public void printStudentDetails(){
        studentView.printStudentDetails(getStudentName(), getStudentRollNumber());
    }

    public void setStudentRollNumber(int num){
        studentModel.setRollno(num);
    }

    public void setStudentName(String name){
        studentModel.setName(name);
    }

    public String getStudentName(){
        return studentModel.getName();
    }

    public int getStudentRollNumber(){
        return studentModel.getRollno();
    }
}
