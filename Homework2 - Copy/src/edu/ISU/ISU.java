package edu.ISU;

import edu.University;

import java.util.ArrayList;
import java.util.List;

public class ISU extends University {
    private String universityName;
    private List<Teacher> teachers=new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    public ISU()
    {
        this.universityName = "Ilia State University";
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

    public void addATeacher(String name){
        Teacher teacher=new Teacher(name);
        teachers.add(teacher);
    }
    public void addATeacher(String name,String title){
        Teacher teacher=new Teacher(name,title);
        teachers.add(teacher);
    }
    public void getTeacherList(){
        System.out.println("-------- This is the teacher info from the Ilia State University ---------");
            for (Teacher e:teachers){
                System.out.println(e.getTitle()+" "+e.getName());
            }
    }

}
