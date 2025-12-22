public class DogObject {
    static String sound;
    String name;
    int age;
    String color;
    String breed;

    public DogObject(int Dogage , String Color){
        age=Dogage;
        color=Color;
    }
    public static void main(String args[]){
        DogObject dg =  new DogObject(45,"white");
        System.out.println(dg.getName());
        System.out.println(dg.getColor());
        System.out.println(dg.getAge());
        System.out.println(sound());
    }
    public static String sound(){
        return sound;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
}
