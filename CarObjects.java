public class CarObjects {
    static String speed;
    String color;
    int year;
    String model;

    public CarObjects(int years,String modelName){
       year=years;
       model=modelName;
    }
    public static void main(String args[]){
        CarObjects CO = new CarObjects(2025,"BMW");
        System.out.println(getSpeed());
        System.out.println(CO.getModel());
        System.out.println(CO.getYear());
    }
    public static String getSpeed(){
        return speed;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }

}
