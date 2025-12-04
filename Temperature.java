public class Temperature {
    public static void temperature(int temp){
        if(temp>=40){
            System.out.println("Its Very Hot");
        }else if(temp>=30){
            System.out.println("Its Little Sunny");
        }else if(temp>=20){
            System.out.println("Its Normal Temperature");
        }else{
            System.out.println("Its cold");
        }
    }
}
