import java.util.Scanner;

public class Jetengine {
    private final int x;
    private final int y;
    public Jetengine(int x,int y){
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runtime.getRuntime().addShutdownHook(new Thread(()-> {
            sc.close();
        }));
        int inp = sc.nextInt();
        int inp2 = sc.nextInt();
        Jetengine obj = new Jetengine(inp,inp2);
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
