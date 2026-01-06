public class Current extends Bank {
    String compoundInterest;
    public Current(){

    }
    public Current(String accountholder,double balance,String compoundInterest){
        super(accountholder,balance);
        this.compoundInterest=compoundInterest;
    }

    public static void main(String args[]){
        Current current = new Current();
        current.setAccountholder("Sindhu");
        System.out.println(current.getAccountholder());
        current.setCompundInterset("45356");
        System.out.println(current.getCompundInterset());
    }
    public void setAccountholder(String accountholder){
        this.accountholder=accountholder;
    }
    public String getAccountholder(){
        return accountholder;
    }
    public void setCompundInterset(String compoundInterset){
        this.compoundInterest=compoundInterset;
    }
    public String getCompundInterset(){
        return compoundInterest;
    }
}
