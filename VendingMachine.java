public class VendingMachine {
    public static void main(String[] args){
        int value=1;
        vendingMachine(value);
    }
    public static void vendingMachine(int value){
        if(value==0){
            System.out.println("Then it will provide the milk");
        }else if(value==1){
            System.out.println("Then it will provide the coffee");
        }else if(value==2){
            System.out.println("Then it will provide the Tea");
        }else{
            System.out.println("Invaild Option");
        }
    }
}
