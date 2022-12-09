public class Practice3_Circle {
    private double radius = 1;
    private String color = "red";

    public Practice3_Circle(){

    }
    public Practice3_Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius * 2 * Math.PI;
    }
}
