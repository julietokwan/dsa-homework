package week3.homework2;

import java.util.ArrayList;

public class ReportGenerator {

    // Student Report
    public void generateStudentReport(String studentId,
                                      StudentManager sm,
                                      EnrollmentManager em) {

        Student s = sm.findStudent(studentId);
        if (s == null) {
            System.out.println("Student not found: " + studentId);
            return;
        }

        System.out.println("=== Student Report ===");
        System.out.println(s);
        System.out.println("GPA: " + em.calculateStudentGpa(studentId));

        ArrayList<Enrollment> enrollments = em.getEnrollmentsByStudent(studentId);
        if (enrollments.isEmpty()) {
            System.out.println("No enrollments.");
        } else {
            System.out.println("Enrollments:");
            for (Enrollment e : enrollments) {
                System.out.println(" - " + e);
            }
        }
    }

    // Course Report
    public void generateCourseReport(String courseCode,
                                     CourseManager cm,
                                     EnrollmentManager em) {

        Course c = cm.findCourse(courseCode);
        if (c == null) {
            System.out.println("Course not found: " + courseCode);
            return;
        }

        System.out.println("=== Course Report ===");
        System.out.println(c);

        ArrayList<Enrollment> enrollments = em.getEnrollmentsByCourse(courseCode);
        if (enrollments.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }

        System.out.println("Enrolled Students:");
        double totalPoints = 0;
        int gradedCount = 0;

        for (Enrollment e : enrollments) {
            System.out.println(" - " + e.getStudentId() + " | Grade: " + e.getGrade());
            double gp = e.getGradePoints();
            if (gp >= 0) {
                totalPoints += gp;
                gradedCount++;
            }
        }

        if (gradedCount > 0) {
            System.out.println("Average Grade Points: " + (totalPoints / gradedCount));
        } else {
            System.out.println("No graded enrollments yet.");
        }
    }

    // Major Report
    public void generateMajorReport(String major, StudentManager sm) {
        System.out.println("=== Major Report: " + major + " ===");
        ArrayList<Student> students = sm.getStudentsByMajor(major);
        if (students.isEmpty()) {
            System.out.println("No students in this major.");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Average GPA in " + major + ": " +
                sm.getAverageGpaByMajor(major));
    }

    // Honor Roll Report
    public void generateHonorRollReport(StudentManager sm, double minGpa) {
        System.out.println("=== Honor Roll (GPA >= " + minGpa + ") ===");
        ArrayList<Student> honors = sm.getHonorStudents(minGpa);
        if (honors.isEmpty()) {
            System.out.println("No honor students.");
            return;
        }
        for (Student s : honors) {
            System.out.println(s);
        }
    }
}