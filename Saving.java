public class Saving extends Bank {
    String rateofInterset;
    public Saving(){
    }
    public Saving( String accountholder,double balance,String rateofInterset){
        super(accountholder,balance);
        this.rateofInterset=rateofInterset;
    }
    public static void main(String[] args){
        Saving saving=new Saving();
        saving.setRateOfInterset("23434");
        System.out.println(saving.getRateOfInterset());
    }
    public void setRateOfInterset(String rateofInterset){
        this.rateofInterset=rateofInterset;
    }
    public String getRateOfInterset(){
        return rateofInterset;
    }
}
