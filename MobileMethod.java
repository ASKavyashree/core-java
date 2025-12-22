public class MobileMethod {
    String name;
    static String color="green";
    static String model="Sumsung";
    public static void main(String[] args){
        MobileMethod Mm = new MobileMethod();
        System.out.println(Mm.name);

        Mm.name="Motorala";
        System.out.println("After modifying first object");
        System.out.println(Mm.color);
        System.out.println("Calling  non static method");
        System.out.println(Mm.name);
        System.out.println("First object name");
        System.out.println(Mm.model);
        System.out.println("Modifyiing first object");
        Mm.model="Iphone";
        System.out.println("Accesing static method ");
        System.out.println(MobileMethod.DisplayColor());
        System.out.println("Accesing the non static method");
        System.out.println(Mm.Display());
    }

    public static String DisplayColor(){
        return color;
    }
    public String Display(){
        return "Models are Avaiable";
    }
}
