public class GrandFather {
    String name;
    String fathername;
    int age;
    public GrandFather(){

    }
    public GrandFather(String name,int age){
        this.name=name;
        this.age=age;
    }
    public GrandFather(String name,String fathername){
        this.name=name;
        this.fathername=fathername;
    }
    public static void main(String[] args){
        GrandFather grandfather = new GrandFather();
        grandfather.setName("Ramesh");
        System.out.println(grandfather.getName());
        System.out.println(grandfather.getAge());
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
