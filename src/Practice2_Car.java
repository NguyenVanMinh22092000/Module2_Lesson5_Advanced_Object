public class Practice2_Car {
    private String brand = "Toyota";
    private String color = "Purple";
    private static int yearLaunch = 2012;

    public Practice2_Car( String a, String b){
        this.brand = a;
        this.color = b;
        yearLaunch++;
    }
    public static int display(){
        return yearLaunch;
    }
}
