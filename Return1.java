public class Return1 {
    public static void main(String[] args){
        int result = addition();
        System.out.println(result);
        String a=vegetable();
        System.out.println(a);
        char a1=alph();
        System.out.println(a1);
        float a2=num();
        System.out.println(a2);
        boolean a3=num1();
        System.out.println(a3);
        long a4 = num2();
        System.out.println(a4);
        double a5 = num3();
        System.out.println(a5);
    }
    public static int addition(){
        int num1=10;
        int num2=20;
        int result=num1+num2;
        return result;
    }
     public static String vegetable(){
        String a="Carrot";
        return a;
    }
    public static char alph(){
        char a='a';
        return a;
    }
    public static float num(){
        float a=12.4f;
        return a;
    }
    public static boolean num1(){
        boolean a= true;
        return a;
    }
    public static long num2(){
        long a=1234l;
        return a;
    }
    public static double num3(){
        double a = 123.738d;
        return a;
    }
}
