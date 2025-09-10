import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Which Operation you want to perform ?");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.print("Select your option:");
            int opt = sc.nextInt();
            if (opt == 5){
                break;
            }
            System.out.print("Enter first no.:");
            int x = sc.nextInt();
            System.out.print("Enter Second no.:");
            int y = sc.nextInt();
            System.out.print("Answer:");
            if (opt == 1){
                System.out.println(second.addition(x, y));
            }
            if (opt == 2){
                System.out.println(second.subtraction(x, y));
            }
            if (opt == 3){
                System.out.println(second.multiplication(x, y));
            }
            if (opt == 4){
                System.out.println(second.division(x, y));
            }
        }
        sc.close();
    }
}
