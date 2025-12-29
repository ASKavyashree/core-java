public class EmployeeConstructor {
    
    String name;
    String city;
    int idcard;

    public EmployeeConstructor(){

    }
    public EmployeeConstructor(String name,String city){
        this.name=name;
        this.city=city;
    }
    public EmployeeConstructor(String name,int idcard){
        this.name=name;
        this.idcard=idcard;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }
    public void setidCard(int idcard){
        this.idcard=idcard;
    }
    public int getidCard(){
        return idcard;
    }

}
