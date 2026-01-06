public class Father extends GrandFather {
String mothername;
String occupation;
public Father(){

}
public Father(String name,String age,String mothername,String occupation)
{
    super(name,age);
    this.mothername=mothername;
    this.occupation=occupation;
}    
public static void main(String[] args){
    Father father = new Father();
    father.setMotherName("suma");
    System.out.println(father.getMotherName());
    System.out.println(father.getName());
}
public void setMotherName(String mothername){
    this.mothername=mothername;
}
public String getMotherName(){
    return mothername;
}
}
