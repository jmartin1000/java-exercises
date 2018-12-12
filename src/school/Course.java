package school;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {

    private final String courseName;
    private final String section;
    private String instructor;
    private final int creditHours;
    // roster map has student name and studentID
    private final HashMap<String, Integer> roster = new HashMap<>();

    public Course (String courseName, String section, String instructor, int creditHours) {
        this.courseName = courseName;
        this.section = section;
        this.instructor = instructor;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSection() {return section;}

    public String getInstructor() {
        return instructor;
    }

    void setInstructor(String aInstructor) {
        instructor = aInstructor;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public HashMap<String, Integer> getRoster() {
        return roster;
    }

    void setRoster(Student aStudent) {
        roster.put(aStudent.getName(), aStudent.getStudentID());
    }

    public String toString() {
        return courseName + ": " + section + " (" + creditHours + " hrs)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseName().equals(course.getCourseName()) &&
                Objects.equals(getSection(), course.getSection()) &&
                getInstructor().equals(course.getInstructor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseName(), getSection(), getInstructor());
    }
}
