public class TVRemote {
   public void turnOn(){
    System.out.println("TV Remote is on");
   } 
   public void turnOff(){
    System.out.println("TV Remote is off");
   }
   public static void main(String[] args){
   TVRemote remote=new TVRemote();
    remote.turnOff();
    remote.turnOn();
   }
}
