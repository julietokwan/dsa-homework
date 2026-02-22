package week3.homework2;

import java.util.ArrayList;

public class EnrollmentManager {

    private ArrayList<Enrollment> enrollments;

    public EnrollmentManager() {
        enrollments = new ArrayList<>();
    }

    public void enrollStudent(String studentId, String courseCode, String semester) {
        String enrollmentId = "E" + (enrollments.size() + 1);
        Enrollment e = new Enrollment(enrollmentId, studentId, courseCode, null, semester);
        enrollments.add(e);
    }

    public boolean dropEnrollment(String enrollmentId) {
        Enrollment e = findEnrollment(enrollmentId);
        if (e != null) {
            enrollments.remove(e);
            return true;
        }
        return false;
    }

    public Enrollment findEnrollment(String enrollmentId) {
        for (Enrollment e : enrollments) {
            if (e.getEnrollmentId().equals(enrollmentId)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Enrollment> getEnrollmentsByStudent(String studentId) {
        ArrayList<Enrollment> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getStudentId().equals(studentId)) {
                result.add(e);
            }
        }
        return result;
    }

    public ArrayList<Enrollment> getEnrollmentsByCourse(String courseCode) {
        ArrayList<Enrollment> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getCourseCode().equals(courseCode)) {
                result.add(e);
            }
        }
        return result;
    }

    public void assignGrade(String enrollmentId, String grade) {
        Enrollment e = findEnrollment(enrollmentId);
        if (e == null) {
            System.out.println("Error: Enrollment not found.");
            return;
        }

        if (!isValidGrade(grade)) {
            System.out.println("Error: Invalid grade.");
            return;
        }

        e.setGrade(grade);
    }

    private boolean isValidGrade(String grade) {
        return grade.equalsIgnoreCase("A") ||
                grade.equalsIgnoreCase("B") ||
                grade.equalsIgnoreCase("C") ||
                grade.equalsIgnoreCase("D") ||
                grade.equalsIgnoreCase("F");
    }

    public double calculateStudentGpa(String studentId) {
        ArrayList<Enrollment> list = getEnrollmentsByStudent(studentId);

        if (list.isEmpty()) return 0.0;

        double total = 0;
        int count = 0;

        for (Enrollment e : list) {
            double points = e.getGradePoints();
            if (points >= 0) {
                total += points;
                count++;
            }
        }

        return count == 0 ? 0.0 : total / count;
    }

    // Students in course
    public ArrayList<String> getStudentsInCourse(String courseCode) {
        ArrayList<String> result = new ArrayList<>();
        for (Enrollment e : enrollments) {
            if (e.getCourseCode().equals(courseCode)) {
                result.add(e.getStudentId());
            }
        }
        return result;
    }

    public int getEnrollmentCount(String courseCode) {
        return getEnrollmentsByCourse(courseCode).size();
    }

    public void printAllEnrollments() {
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments available.");
            return;
        }

        for (Enrollment e : enrollments) {
            System.out.println(e);
        }
    }
}