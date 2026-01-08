public class BankMetho {
    String name;
    String branch;

    public float getIntersetRate(){
        return 5.7f;
    }
    public float getIntersetRate(String type){
        if(type.equals("homeloan")){
            return 8.5f;
        }else if(type.equals("Vechicle loan")){
            return 4.6f;
        }
        return getIntersetRate();
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBranch(String branch){
        this.branch=branch;
    }
    public String getBranch(){
        return branch;
    }
}
