package week3.homework2;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student (prevent duplicate IDs)
    public void addStudent(Student student) {
        if (findStudent(student.getStudentId()) != null) {
            System.out.println("Error: Student with ID " + student.getStudentId() + " already exists.");
            return;
        }
        students.add(student);
    }

    // Remove student by ID
    public boolean removeStudent(String studentId) {
        Student s = findStudent(studentId);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }

    // Find student by ID
    public Student findStudent(String studentId) {
        for (Student s : students) {
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    // Students by major
    public ArrayList<Student> getStudentsByMajor(String major) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getMajor().equalsIgnoreCase(major)) {
                result.add(s);
            }
        }
        return result;
    }

    // Students by year
    public ArrayList<Student> getStudentsByYear(int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getYear() == year) {
                result.add(s);
            }
        }
        return result;
    }

    // Honor students
    public ArrayList<Student> getHonorStudents(double minGpa) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getGpa() >= minGpa) {
                result.add(s);
            }
        }
        return result;
    }

    // Average GPA
    public double getAverageGpa() {
        if (students.isEmpty()) return 0.0;

        double total = 0;
        for (Student s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }

    // Average GPA by major
    public double getAverageGpaByMajor(String major) {
        double total = 0;
        int count = 0;

        for (Student s : students) {
            if (s.getMajor().equalsIgnoreCase(major)) {
                total += s.getGpa();
                count++;
            }
        }

        return count == 0 ? 0.0 : total / count;
    }

    // Print all students in formatted table
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-20s %-5s\n", "ID", "Name", "Major", "GPA");
        System.out.println("------------------------------------------------------------");

        for (Student s : students) {
            System.out.printf("%-10s %-20s %-20s %-5.2f\n",
                    s.getStudentId(),
                    s.getFullName(),
                    s.getMajor(),
                    s.getGpa());
        }

        System.out.println("------------------------------------------------------------");
    }

    // Total students
    public int getTotalStudents() {
        return students.size();
    }

    // Unique majors
    public ArrayList<String> getAllMajors() {
        ArrayList<String> majors = new ArrayList<>();
        for (Student s : students) {
            if (!majors.contains(s.getMajor())) {
                majors.add(s.getMajor());
            }
        }
        return majors;
    }
}