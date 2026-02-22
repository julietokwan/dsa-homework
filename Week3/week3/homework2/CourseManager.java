package week3.homework2;
import java.util.ArrayList;

public class CourseManager {

    private ArrayList<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseCode().equals(courseCode)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Course> getCoursesByInstructor(String instructor) {
        ArrayList<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getInstructor().equalsIgnoreCase(instructor)) {
                result.add(c);
            }
        }
        return result;
    }

    public ArrayList<Course> getAvailableCourses(String studentId,
                                                 StudentManager studentManager,
                                                 EnrollmentManager enrollmentManager) {

        ArrayList<Course> available = new ArrayList<>();
        ArrayList<Enrollment> current = enrollmentManager.getEnrollmentsByStudent(studentId);

        for (Course c : courses) {


            boolean alreadyEnrolled = false;
            for (Enrollment e : current) {
                if (e.getCourseCode().equals(c.getCourseCode())) {
                    alreadyEnrolled = true;
                    break;
                }
            }
            if (alreadyEnrolled) continue;

            boolean meetsPrereqs = true;
            for (String prereq : c.getPrerequisites()) {
                boolean passed = false;

                for (Enrollment e : current) {
                    if (e.getCourseCode().equals(prereq) && e.isPassing()) {
                        passed = true;
                        break;
                    }
                }

                if (!passed) {
                    meetsPrereqs = false;
                    break;
                }
            }

            if (meetsPrereqs) {
                available.add(c);
            }
        }

        return available;
    }

    public void printAllCourses() {
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public int getTotalCourses() {
        return courses.size();
    }
}