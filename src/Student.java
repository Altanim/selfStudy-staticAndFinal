import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int course;
    static int count;
    int age;

    public Student(String name2, int course2, int age) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student #" + count + " created.");
    }

    public static void showCount() {
        System.out.println("Total students is " + count);
    }
    //    we can't use nonstatic variables in static method
//   static void abc(){
//        a++;
//    }

    // but we can use nonstatic variables in methods where object is created
    public static Student draco() {
        Student draco = new Student("Draco", 1, 0);
        draco.age = 11;
        System.out.println(draco.name + ", course " + draco.course + ", age " + draco.age);
        return draco;
    }

    public static void main(String[] args) {
        Student s = new Student("Harry", 1, 11);
        Student s1 = new Student("Hermione", 1, 11);
        Student s2 = new Student("Ronald", 1, 11);
        showCount();
        draco();
        showCount();



    }
}

