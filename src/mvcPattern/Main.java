package mvcPattern;

/**
 * Created by arpit on 11/2/16.
 */

/**
 *
 * MVC Pattern stands for Model-View-Controller Pattern. This pattern is used to separate application's concerns.
 *
 * Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller
 * if its data changes.
 *
 * View - View represents the visualization of the data that model contains.
 *
 * Controller - Controller acts on both model and view. It controls the data flow into model object and
 * updates the view whenever data changes. It keeps view and model separate.
 *
 */
public class Main {

    public static void main(String[] args){
        StudentController studentController = new StudentController(
                new StudentModel("Arpit", 11), new StudentView()
        );
        studentController.printStudentDetails();
        studentController.setStudentRollNumber(20);
        studentController.setStudentName("Parth");
        studentController.printStudentDetails();
    }
}
