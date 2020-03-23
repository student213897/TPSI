package Lab3;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String groupID;
    private List<Double> grades = new ArrayList<>();


    public Student(String firstName, String lastName, String emailAddress, String groupID) {
        super(firstName, lastName, emailAddress);
        this.groupID = groupID;
    }

    public String getGroupID() {
        return this.groupID;
    }

    public void setGroupID(String _groupID) {
        this.groupID = _groupID;
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public List<Double> getGrades() {
        return this.grades;
    }

    double getGradesAverage() {
        double average = 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }

        average = sum / grades.size();

        return average;
    }

}