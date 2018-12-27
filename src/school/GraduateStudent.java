package school;

import java.util.ArrayList;
import java.util.HashMap;

public class GraduateStudent extends Student {

    private String department;
    private String degreeInProgress;
    private HashMap<String, String> degreesCompleted = new HashMap<>();

    private GraduateStudent(String name, int numbersOfCredits, double gpa, String department, String degreeInProgress) {
        super(name, numbersOfCredits, gpa);
        this.department = department;
        this.degreeInProgress = degreeInProgress;
    }

    private GraduateStudent(String name, String department, String degreeInProgress) {
        super(name);
        this.department = department;
        this.degreeInProgress = degreeInProgress;
    }

    public String getDepartment() {
        return department;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    public String getDegreeInProgress() {
        return degreeInProgress;
    }

    private void setDegreeInProgress(String degreeInProgress) {
        this.degreeInProgress = degreeInProgress;
    }

    private void addDegreeCompleted(String degree, String subject, String institution){

        degreesCompleted.put(degree + " of " + subject, institution);
    }

    public HashMap<String, String> getDegreesCompleted() {
        return degreesCompleted;
    }

    @Override
    public String toString() {
        return "GraduateStudent{" +
                ", name='" + name + '\'' +
                ", studentID=" + studentID +
                "department='" + department + '\'' +
                ", degreeInProgress='" + degreeInProgress + '\'' +
                '}';
    }

}
