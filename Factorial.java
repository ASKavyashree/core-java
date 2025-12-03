class Factorial{
    public static void main(String args[]){
        int num=3;
        int result=factorial(num);
        System.out.println(result);
    }
    public static int factorial(int num){
       return num*factorial(num-1);
    }
}