public class Speed {
    private long sum = 0;
    public Speed(){
        for(long i = 0 ; i < 10000000 ; i++){
            sum += i;
        }
    }
    public long getSum(){
        return sum;
    }
    public static void main(String[] args){
        Speed obj = new Speed();
        System.out.println(obj.getSum());
    }
}
