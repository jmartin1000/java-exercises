package school;

import java.util.Objects;

public class Student {

    private String name;
    private final int studentID;
    private int numbersOfCredits;
    private double gpa;

    // use this one for students who arrive with credits and a GPA
    public Student(String name, int studentID, int numbersOfCredits, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.numbersOfCredits = numbersOfCredits;
        this.gpa = gpa;
    }

    // use this one for students who have no credits or GPA at the time of entry
    public Student(String name, int studentID) {

        this(name, studentID, 0, 0);
    }

    public String getName() {

        return name;
    }

    void setName(String aName) {

        name = aName;
    }

    public int getStudentID() {

        return studentID;
    }

    public int getNumbersOfCredits() {

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

    public String getGradeLevel() {
        String level;
        if (this.numbersOfCredits <= 30) {
            level = "Freshman";
        } else if (this.numbersOfCredits <= 60) {
            level = "Sophomore";
        } else if (this.numbersOfCredits <= 90) {
            level = "Junior";
        } else {
            level = "Senior";
        }

        return level;
    }

    public String toString() {
        return name + "(Completed credits: " + numbersOfCredits + ", Cumulative GPA: " + gpa + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentID() == student.getStudentID() &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getStudentID());
    }
}
