package edu;

import edu.ISU.Student;
import java.util.*;

public class University {
    private List<Student> students = new ArrayList<>();
    private String universityName;
    public University(){

    }

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addAStudent(String name, double grade) {
        students.add(new Student(name, grade));
    }

    public void getStudentInfo() {
        System.out.println("This is student info from " + universityName);
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.grade() + " (" + student.getScore() + ")");
        }


    }
    public void removeStudent(int index){
        System.out.println(students.get(index).getName()+" will be removed");
        students.remove(index);
    }
}
