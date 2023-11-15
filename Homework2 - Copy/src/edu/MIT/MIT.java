package edu.MIT;

import edu.University;

import java.util.ArrayList;
import java.util.List;

public class MIT extends University {
    private String universityName;
    private List<Student> students = new ArrayList<>();
    public MIT(){
        this.universityName="MIT";
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
