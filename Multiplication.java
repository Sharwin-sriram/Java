
import java.util.Scanner;

public class Multiplication {
    public Multiplication(long num,long iterations){
        long ite = iterations;
        for (long i = 1;i<=ite;i++){
            System.out.println(num + "x" + i + "=" + (i*num));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication table");
        System.out.print("Enter the multiplication table:");
        long num = sc.nextInt();
        System.out.print("Enter the number of iterations:");
        long iterations = sc.nextInt();
        Multiplication mul = new Multiplication(num, iterations);
    }
}