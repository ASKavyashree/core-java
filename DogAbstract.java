public class DogAbstract extends AnimalAbstract{
  public void sound(){
    System.out.println("Bark");
  }
  public void sleep(){
    System.out.println("Dog sleeping");
  }
  public static void main(String[] args){
    DogAbstract dog = new DogAbstract();
    dog.sound();
    dog.sleep();
  }
}
