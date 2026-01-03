public class Fruit {
    String name;
    String variety;
    
    public Fruit(){

    }
    public Fruit(String name,String variety){
        this.name=name;
        this.variety=variety;
    }
    public static void main(String main[]){
        Fruit fruit = new Fruit("Apple","Kashmir Apple");
        System.out.println(fruit.getName());
        System.out.println(fruit.getVareity());
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setVareity(String variety ){
        this.variety=variety;
    }
    public String getVareity(){
        return variety;
    }
}
