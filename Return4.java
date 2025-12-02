public class Return4 {
    public static void main(String[] args){
        int result = divi();
        System.out.println(result);
        String a=vegetable();
        System.out.println(a);
        float b=num1();
        System.out.println(b);
        long c=num2();
        System.out.println(c);
        boolean d= num3();
        System.out.println(d);
    }
    public static int divi(){
        int a=12;
        int b=6;
        int result= a/b;
        return result;
    }
    public static String vegetable(){
        String a="Corn";
        return a;
    }
    public static float num1(){
        float a=12.55f;
        return a;
    }
    public static long num2(){
        long a=132652l;
        return a;
    }
    public static boolean num3(){
        boolean a = true;
        return a;
    }
}

