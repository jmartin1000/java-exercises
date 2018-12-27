package school;

public class UndergraduateStudent extends Student {

    private String major;
    private String minor;

    private UndergraduateStudent(String name, int numbersOfCredits, double gpa){
        super(name, numbersOfCredits, gpa);
    }

    private UndergraduateStudent(String name) {
        super(name);
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

    private void declareMajor(String major) {
        this.major = major;
    }

    private void declareMinor(String minor) {
        this.minor = minor;
    }

    public String getMajor() {
        return major;
    }

    public String getMinor() {
        return minor;
    }
}
