public class BusObject {
    static String model;
    String name;
    int year;
    String capacity;

    public BusObject(String Name,String Capacity){
        name=Name;
        Capacity=capacity;
    }
    public static void main(String[] args){
        BusObject BU = new BusObject("ABC","34kg");
        System.out.println(getModel());
        System.out.println(BU.getName());
        System.out.println(BU.getYear());
        System.out.println(BU.getCapacity());

    }
    public static String getModel(){
        return model;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getCapacity(){
        return capacity;
    }
}
