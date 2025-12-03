public class ExampleOfReturn {
    public static void main(String[] args){
        int result=multiplication();
        System.out.println(result);
    }
    public static int multiplication(){
        int num1 =10;
        int num2 = 20;
        int result =num1*num2;
        return result;
    }
}
