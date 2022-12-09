public class Practice1_Test {
    public static void main(String[] args) {
        Practice1_Static_Method student1 = new Practice1_Static_Method(23, 353, "Nguyen Hue Phuong");
        System.out.println(student1.toString());
        Practice1_Static_Method.changeName();
        System.out.println(student1.toString());

    }
}
