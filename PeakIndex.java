import java.util.*;

public class PeakIndex {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] arr = new int[N];
      for (int i = 0;i < N;i++){
         arr[i] = sc.nextInt();
      }
      int peakele = arr[0];
      int peakind = 0;

      for (int i = 0;i < N;i++){
         if (arr[i] > peakele){
            peakele = arr[i];
            peakind = i;
         }
      }
      System.out.println("Peak Element: "+ peakele + " at index " + peakind);
   }
}
