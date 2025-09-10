public class Car {
    private int yearModel;
    private String Brand;
    private int Price;

    public Car(String b,int y,int p){
        yearModel = y;
        Brand = b;
        Price = p;
    }
    public int getYear(){
        return yearModel;
    }
    public String getBrand(){
        return Brand;
    }
    public int getPrice(){
        return Price;
    }
    public void setYear(int a){
        yearModel = a;
    }
    public void setBrand(String b){
        Brand = b;
    }
    public void setPrice(int p){
        Price = p;
    }
}