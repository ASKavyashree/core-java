public class SbiBankMethod extends BankMetho{
    
    public float getIntersetRate(String type){
        if(type.equals("homeloan")){
            return 3.4f;
        }else if(type.equals("vechicle loan")){
            return 5.7f;
        }
        return getIntersetRate();
    } 
}
