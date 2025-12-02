public class Return2 {
    public static void main(String[] args){
        int a = sub();
        System.out.println(a);
        String a1 = vegetable();
        System.out.println(a1);
        char a2= alph();
        System.out.println(a2);
        float a3=num2();
        System.out.println(a3);
        long a4= num1();
        System.out.println(a4);
    }
    public static int sub(){
        int num1=10;
        int num2 =5;
        int result = num1-num2;
        return result;
    }
    public static String vegetable(){
        String a="Brinjal";
        return a;
    }
    public static char alph(){
        char a ='G';
        return a;
    }
    public static long num1(){
        long a=1234l;
        return a;
    }
    public static float num2(){
        float b=1345.7f;
        return b;
    }
}
