public class Vehicle {
    String model;
    String name;
    public Vehicle(){

    }
    public Vehicle(String name, String model){
        this.name=name;
        this.model=model;
    }
   public static void main(String[] args){
    Vehicle vechile = new Vehicle("Tata","20");
    System.out.println(vechile.getName());
    System.out.println(vechile.getModel());
   } 
   public void setName(String name){
    this.name=name;
   }
   public String getName(){
    return name;
   }
   public void setModel(String model){
    this.model=model;
   }
   public String getModel(){
    return model;
   }
}
