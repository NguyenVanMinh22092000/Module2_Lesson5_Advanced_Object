public class Practice1_Static_Method {
    private int age;
    private double id;
    private static String name = "Minh";

    public Practice1_Static_Method( int a, double b, String c){
        age = a;
        id = b;
        name = c;
    }
    public static void changeName(){
        name = "TU LINH";
    }
    public String toString(){
        return " The information of students : ID = " + id + " AGE = " + age + " NAME = " + name;
    }
}
