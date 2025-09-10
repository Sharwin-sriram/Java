import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m == 0 || n == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            if (m % n == 0){
                System.out.println(m + " is a multiple of " + n);
            } else {
                System.err.println(m + " is not a multiple of " + n);
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
