public class PersonObject {
    static String color; 
    String firstName;
    String secondName;
    int age;
 
    public PersonObject(int pAge,String Fperson,String Sperson,String pColor){
        age=pAge;
        firstName=Fperson;
        secondName=Sperson;
        color=pColor;
    }
    public static void main(String args[]){

        PersonObject PG=new PersonObject(23,"John","deo","brown");
        System.out.println(getColor());
        System.out.println(PG.getfName());
        System.out.println(PG.getsName());
        System.out.println(PG.getAge());

    }
    public static String getColor(){
        return color;
    }
    public String getfName(){
        return firstName;
    }
    public String getsName(){
        return secondName;
    }
    public int getAge(){
        return age;
    }
}
