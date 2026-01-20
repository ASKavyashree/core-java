public class CarAbstract extends VechicleAbstract {
   public void engine(){
    System.out.println("Diesel engine");
   } 
   
   public static void main(String[] args){
    CarAbstract car = new CarAbstract();
    car.engine();
   }
}
