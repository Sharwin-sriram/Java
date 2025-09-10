import java.util.Scanner;

class Cutoff extends Exception {
    public Cutoff(String msg) {
        super(msg);
    }
}

class Stud {
    String name;
    float Cutoff;

    public Stud(String name, float Cutoff) throws Cutoff {
        this.name = name;
        this.Cutoff = Cutoff;

        if (Cutoff < 120) {
            throw new Cutoff("Sorry this cutoff is not eligible");
        }
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Cutoff Marks: " + Cutoff);
        System.out.println("Eligible for admission");
    }
}

public class College {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your name");
            String name = sc.nextLine();
            System.out.print("Enter your marks");
            float cutoff = sc.nextFloat();
            Stud ss = new Stud(name, cutoff);
            ss.display();
        } catch(Cutoff c) {
            System.out.println(c.getMessage());
        }
    }
}