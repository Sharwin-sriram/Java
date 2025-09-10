import java.util.*;

public class Spiral {
  public static void main(String[] args) {
    int row_start, row_end = 0;
    int col_start, col_end = 0;

    Scanner sc = new Scanner(System.in);
    int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

    // int inp = sc.nextInt();
    // int[][] matrix = new int[inp][inp];
    // for (int i = 0; i < inp; i++) {
    //   for (int j = 0; j < inp; j++) {
    //     matrix[i][j] = sc.nextInt();
    //   }
    // }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf("%d ", matrix[i][j]);
      }
      System.out.println("");
    }

  }
}