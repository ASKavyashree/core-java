public class ConstructorVariable {
    String name;
    static String type;
    public ConstructorVariable(){
       //Default constructor 
    }
    public ConstructorVariable(String animalname,String animaltype){
        name=animalname;
        type=animaltype;
    }
    public static void main(String[] args){
        String animalName="";
        System.out.println(animalName);
        ConstructorVariable animal=new ConstructorVariable("dog","");
        System.out.println(animal.name);
        System.out.println(animal.getName());
        System.out.println("Calling  static method");
        System.out.println(getType());

    }
    public String getName(){
        return name;
    }
    public static String getType(){
        return type;
    }

    
}
