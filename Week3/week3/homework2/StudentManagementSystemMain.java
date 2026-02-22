package week3.homework2;

public class StudentManagementSystemMain {

    public static void main(String[] args) {

        StudentManager sm = new StudentManager();
        CourseManager cm = new CourseManager();
        EnrollmentManager em = new EnrollmentManager();
        ReportGenerator rg = new ReportGenerator();

        sm.addStudent(new Student("S1", "Juliet", "Okwan", "juliet@school.edu", 3.8, "CS", 2));
        sm.addStudent(new Student("S2", "Michael", "Lee", "mlee@school.edu", 3.2, "Math", 1));
        sm.addStudent(new Student("S3", "Aisha", "Khan", "akhan@school.edu", 3.9, "CS", 3));

        Course c1 = new Course("CS101", "Intro to CS", 3, "Dr. Smith", 30);
        Course c2 = new Course("CS201", "Data Structures", 4, "Dr. Smith", 25);
        Course c3 = new Course("MATH101", "Calculus I", 4, "Dr. Brown", 40);

        c2.addPrerequisite("CS101");

        cm.addCourse(c1);
        cm.addCourse(c2);
        cm.addCourse(c3);

        em.enrollStudent("S1", "CS101", "Fall 2024");
        em.enrollStudent("S1", "MATH101", "Fall 2024");
        em.enrollStudent("S2", "MATH101", "Fall 2024");
        em.enrollStudent("S3", "CS101", "Fall 2024");

        em.assignGrade("E1", "A");
        em.assignGrade("E2", "B");
        em.assignGrade("E3", "A");
        em.assignGrade("E4", "A");

        System.out.println("\n--- STUDENT REPORT ---");
        rg.generateStudentReport("S1", sm, em);

        System.out.println("\n--- COURSE REPORT ---");
        rg.generateCourseReport("CS101", cm, em);

        System.out.println("\n--- MAJOR REPORT ---");
        rg.generateMajorReport("CS", sm);

        System.out.println("\n--- HONOR ROLL ---");
        rg.generateHonorRollReport(sm, 3.5);
    }
}