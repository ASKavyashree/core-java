class CarSet{
    static String sound;
    String model;
    String year;
    String name;

    public CarSet(){

    }
    public CarSet(String year,String name,String sound){
        this.year=year;
        this.name=name;
        this.sound=sound;
    }   
    public static void main(String args[]){
        CarSet car = new CarSet("2023","BMW","horn");
        System.out.println(car.sound);
        System.out.println(car.getYear());
        car.setModel("Tata");
        System.out.println(car.model);
    }
    public void setYear(String name){
        this.name=name;
    }
    public String getYear(){
        return year;
    }
    public void setModel(String model){
        this.model=model;
    }
}