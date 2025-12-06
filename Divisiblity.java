public class Divisiblity {
    public static void main(String[] args){
        for(int i=1;i<=50;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+"is divisible by 3 and 5");
            }else if(i%3==0){
                System.out.println(i+"is divisible by 3");
            }else if(i%5==0){
                System.out.println(i+"is divisible by 5");
            }else {
                System.out.println("it is not divisible by 3 and 5");
            }
        }
    }
}
