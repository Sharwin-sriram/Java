import java.util.Scanner;

public class Java {
  static int MyMethod(int a){
    return a+5;
  }

  static float MyMethod(float a){
    return a+5;
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = (int) sc.nextFloat();
      float b = (float) a;
      System.out.println(MyMethod(a));
      System.out.println(MyMethod(b));
  }
}