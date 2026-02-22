package week3.homework2;

public class Enrollment {

    private String enrollmentId;
    private String studentId;
    private String courseCode;
    private String grade;
    private String semester;

    public Enrollment(String enrollmentId, String studentId, String courseCode,
                      String grade, String semester) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.grade = grade;
        this.semester = semester;
    }

    public String getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(String enrollmentId) { this.enrollmentId = enrollmentId; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }

    public double getGradePoints() {
        if (grade == null) return -1; // not graded yet

        switch (grade.toUpperCase()) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            default: return -1; // invalid grade
        }
    }

    // Passing = A, B, C, D
    public boolean isPassing() {
        if (grade == null) return false;
        return grade.equalsIgnoreCase("A") ||
                grade.equalsIgnoreCase("B") ||
                grade.equalsIgnoreCase("C") ||
                grade.equalsIgnoreCase("D");
    }

    @Override
    public String toString() {
        return "Enrollment ID: " + enrollmentId +
                ", Student: " + studentId +
                ", Course: " + courseCode +
                ", Grade: " + grade +
                ", Semester: " + semester;
    }
}