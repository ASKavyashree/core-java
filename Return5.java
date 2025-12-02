public class Return5 {
    public static void main(String[] args){
        int result = oddNumber();
        System.out.println(result);
        char a=alpha();
        System.out.println(a);
        float b= num1();
        System.out.println(b);
        String c=var();
        System.out.println(c);
        double d=num2();
        System.out.println(d);
    }
    public static int oddNumber(){
        int a=3;
        return a;
    }
    public static char alpha(){
        char a='k';
        return a;
    }
    public static float num1(){
        float num1=12.98f;
        return num1;
    }
    public static String var(){
        String var="Java";
        return var;
    }
    public static double num2(){
        double num=23.4734d;
        return num;
    }
}
