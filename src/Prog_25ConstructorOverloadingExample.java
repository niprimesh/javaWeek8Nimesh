/**
 * java program to over load constructors
 */

public class Prog_25ConstructorOverloadingExample {

    static class Student5 {
        int id;
        String name;
        int age;
        //creating two arg constructor
        Student5(int i, String n) {
            id = i;
            name = n;
        }
        //creating three arg constructor
        Student5(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }
        public void display() {
            System.out.println(id + " " + name + " " + age);
        }
        public static void main(String[] args) {
            Student5 s1 = new Student5 (111, "karan");
            Student5 s2 = new Student5 (222, "aryan", 25);
            s1.display();
            s2.display();
        }
    }

}
