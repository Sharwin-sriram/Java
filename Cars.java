public class Cars {
    public static void main(String[] args) {
        Car one = new Car("Mustang",1969,20000);
        Car two = new Car("GT3 RS", 2019, 2000000);
        System.out.println("Brand: "+one.getBrand());
        System.out.println("Price: "+one.getPrice());
        System.out.println("Year: "+one.getYear());
        System.out.println("");
        System.out.println("Brand: "+two.getBrand());
        System.out.println("Price: "+two.getPrice());
        System.out.println("Year: "+two.getYear());
    }
}