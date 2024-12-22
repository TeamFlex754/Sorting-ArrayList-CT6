import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.swap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "John", "123 Maple st."));
        students.add(new Student(2, "Mary", "574 Oak st."));
        students.add(new Student(7, "Sam", "765 Beaver tr."));
        students.add(new Student(9, "Becky", "653 Johnson lane"));
        students.add(new Student(4, "Steve", "887 Green rd."));
        students.add(new Student(8, "Tim", "774 Lucky ln."));
        students.add(new Student(12, "Susan", "656 Allen st."));
        students.add(new Student(40, "Ashley", "353 First st."));
        students.add(new Student(3, "Mike", "112 Second st."));
        students.add(new Student(25, "Josh", "556 Timber ln."));

        for ( Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nStudents sorted by Name:");
        SelectionSort.sort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nStudents sorted by Roll Number");
        SelectionSort.sort(students, new RollnoComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}