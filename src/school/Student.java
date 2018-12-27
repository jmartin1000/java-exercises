package school;

import java.util.Objects;

public class Student extends AbstractEntity {

    String name;
    final String studentID;
    int numbersOfCredits;
    double gpa;

    // use this one for students who arrive with credits and a GPA
    // package private so that subclasses can use it
    Student(String name, int numbersOfCredits, double gpa) {
        this.name = name;
        this.studentID = assignStudentID(name);
        this.numbersOfCredits = numbersOfCredits;
        this.gpa = gpa;
    }

    // use this one for students who have no credits or GPA at the time of entry
    // package private so that subclasses can use it
    Student(String name) {

        this(name,0, 0);
    }

    public String getName() {

        return name;
    }

    void setName(String aName) {

        name = aName;
    }

    String getStudentID() {

        return studentID;
    }

    int getNumbersOfCredits() {

        return numbersOfCredits;
    }

    void setNumbersOfCredits(int aNumbersOfCredits) {

        numbersOfCredits += aNumbersOfCredits;
    }

    public double getGpa() {

        return gpa;
    }

    void setGpa(double aGpa) {

        gpa = aGpa;
    }

    public void addGrade(int courseCredits, double grade) {

        double newGPA = ((this.gpa * this.numbersOfCredits) + (courseCredits * grade)) / (this.getNumbersOfCredits() + courseCredits);
        int newCredits = this.numbersOfCredits + courseCredits;

        this.setNumbersOfCredits(newCredits);
        this.setGpa(newGPA);
    }

    public String toString() {
        return name + "(Completed credits: " + numbersOfCredits + ", Cumulative GPA: " + gpa + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentID().equals(student.getStudentID()) &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentID());
    }
}
