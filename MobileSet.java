public class MobileSet {
    static String gb;
    String model;
    String year;
    String name;
    
    public MobileSet(){

    }
    public MobileSet(String model,String name){
        this.model=model;
        this.name=name;
    }
    public static void main(String args[]){
        MobileSet mobile = new MobileSet("5G","Motorola");
        System.out.println(mobile.getName());
        System.out.println(mobile.getModel());
        mobile.setYear("2015");
        System.out.println(mobile.year);

    }
    public void setYear(String year){
        this.year=year;
    }
    public String getName(){
        return name;
    }
    public String getModel(){
        return model;
    }
}
