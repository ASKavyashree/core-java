public class Budget {
    
    public static void buget(int amount){
        if(amount >=100000){
            System.out.println("Iphone are available");
        }else if(amount >=50000){
            System.out.println("SamSung phone are available");
        }else if(amount>=30000){
            System.out.println("Motorola phone are  available");
        }else if (amount >=10000){
            System.out.println("All type of mobile will get");
        }else{
            System.out.println("Unavailable of mobile to your amount");
        }
    }
}
