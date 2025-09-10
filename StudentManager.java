import java.util.*;

class Student {
    private String StudentName;
    private int StudentAge;
    private long rollno;
    private float CGPA;

    Student(String StudentName,int StudentAge,long rollno,float CGPA){
        this.StudentName = StudentName;
        this.StudentAge = StudentAge;
        this.rollno = rollno;
        this.CGPA = CGPA;
    }

    void Display(){
        System.out.println("");
        System.out.println("Student Details");
        System.out.println("Student's Name: " + StudentName);
        System.out.println("Studentage: " + StudentAge);
        System.out.println("Roll no: " + rollno);
        System.out.println("CGPA: " + CGPA);
    }

    void free(){
        StudentName = null;
        StudentAge = 0;
        rollno = 0;
        CGPA = 0;
    }
}

public class StudentManager{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student's age: ");
        int age = sc.nextInt();
        System.out.print("Enter Roll no.: ");
        long roll = sc.nextLong();
        System.out.print("Enter CGPA:");
        float cgpa = sc.nextFloat();

        Student obj = new Student(name, age, roll, cgpa);
        obj.Display();
        System.out.println("\n deallocating resources");
        obj.free();
    }
}