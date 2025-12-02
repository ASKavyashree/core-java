public class Return3 {
    public static void main(String[] args){
        int a=multiplication();
        System.out.println(a);
        String b=vegetable();
        System.out.println(b);
        float c=num();
        System.out.println(c);
        long d=num1();
        System.out.println(d);
        boolean t=num3();
        System.out.println(t);
    }
    public static int multiplication(){
        int a=10;
        int b =12;
        int result = a*b;
        return result;
    }
    public static String vegetable(){
        String f="Beetroot";
        return f;
    }
    public static float num(){
        float a=13.2f;
        return a;
    }
    public static long num1(){
        long a=138887l;
        return a;
    }
    public static boolean num3(){
        boolean t=false;
        return t;
    }
}
