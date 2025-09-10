import java.util.Scanner;

class Arrr {
    private final int a;
    private final int size = 100;
    private final int[][] Arr = new int[size][size];
    Arrr() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (int i = 0;i < a;i++){
            for (int j = 0;j < i;j++){
                Arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        Arrr arr = new Arrr();
        System.out.print(arr.a);
        for (int ic = 0;ic < arr.a;ic++){
            for (int jc = 0;ic < arr.a;jc++){
                System.out.println(arr.Arr[ic][jc]);
            }
        }
    }
}
