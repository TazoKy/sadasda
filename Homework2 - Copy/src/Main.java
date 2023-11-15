// This the second homework assignment
// Create a package to create universities with a list of students
//

import edu.ISU.*;
import edu.MIT.*;

public class Main {
    public static void main(String[] args) {
        ISU isu = new ISU();
        MIT mit = new MIT();

        isu.addAStudent("Giogi", 87.0);
        isu.addAStudent("Mariam", 93.2);
        isu.addAStudent("Peter", 65.2);
        isu.addAStudent("Saba", 73.4);
        isu.addAStudent("Xman", 57.3);
        System.out.println("---------------------------------");
        isu.getStudentInfo();

        mit.addAStudent("John", 77.2);
        mit.addAStudent("Grace", 93.3);
        mit.addAStudent("Sam", 67.1);

        System.out.println("---------------------------------");
        mit.getStudentInfo();

        System.out.println("\n\n");
        isu.removeStudent(2);
        isu.removeStudent(2);
        System.out.println("----------------Update-----------------");
        isu.getStudentInfo();
        isu.addATeacher("George Smith", "Professor");
        isu.addATeacher("Luka Peterson");
        isu.getTeacherList();
    }
}