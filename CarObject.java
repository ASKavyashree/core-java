public class CarObject{

    static String name="BMW";
    String color ="Blue";

    public static void main(String[] args){
        int mileage=50;
        System.out.println(mileage);

        CarObject c1 = new CarObject();
        System.out.println(c1.name);

        CarObject c2 = new CarObject();
        System.out.println(c2.color);
    }
}