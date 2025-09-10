import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double farenheit;
            while (true) {
                try {
                    System.out.println("\n");
                    System.out.print("Enter a Temperature:");
                    farenheit = sc.nextDouble();
                    double Celcius = (farenheit - 32) / 1.8;
                    System.out.printf("Temperature in celcius : %.2f", Celcius);
                    sc.nextLine();
                    System.out.println("\nContinue ? (y/n):");
                    String str = sc.nextLine();
                    if (str.equals("n")){
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please Enter a Valid data...");
                    System.out.println("Continue ? (y/n):");
                    sc.nextLine();
                    String str = sc.nextLine();
                    if (str.equals("n")){
                        break;
                    }
                    System.out.print(str);
                } catch (IndexOutOfBoundsException i) {
                    System.out.println(i);
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
