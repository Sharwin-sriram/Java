import java.util.Scanner;

public class Jaava {
    enum Level {
        LOW,
        HIGH
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        try {
            a = sc.nextInt();
            int num = 10;
            if (num == a){
                System.out.println(Level.LOW);
            }else {
                System.out.println("Hi...");
            }
        } catch (Exception e) {
            System.out.println("Something went Wrong \n");
        }
        sc.close();
    }
}