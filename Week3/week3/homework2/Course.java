package week3.homework2;

import java.util.ArrayList;

public class Course {

    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    private int capacity;
    private ArrayList<String> prerequisites;

    public Course(String courseCode, String courseName, int credits, String instructor, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.capacity = capacity;
        this.prerequisites = new ArrayList<>();
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
    public String getInstructor() { return instructor; }
    public int getCapacity() { return capacity; }
    public ArrayList<String> getPrerequisites() { return prerequisites; }

    public void addPrerequisite(String courseCode) {
        prerequisites.add(courseCode);
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName + " (" + credits + " credits)";
    }
}
