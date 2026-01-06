public class Bank {
    String accountholder;
    double balance;

    public Bank(){
    }
    public Bank(String accountholder,double balance){
        this.accountholder=accountholder;
        this.balance=balance;
    }
    public static void main(String args[]){
        Bank bank=new Bank();
        bank.setAccountholder("Kavya");
        System.out.println(bank.getAccountholder());
    }
    public void setAccountholder(String accountholder){
        this.accountholder=accountholder;
    }
    public String getAccountholder(){
        return accountholder;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
}
