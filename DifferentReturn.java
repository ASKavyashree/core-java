class DifferentReturn{
    public static void main(String args[]){
        int num1=12;
        int num2=15;
        char num3='a';
        String var1="java";
        char a='a';
        long a1=12323l;
        double a3=12.3432d;
        addition(num1,num2);
        num1(num1,num2);
        num2(a);
        num3(a1);
        var(var1);
        float resultSubract = substract(120.12f,100);
        System.out.println(resultSubract);

        float resultSubstractChar = substractForChar(num1,num3);
            System.out.println(resultSubstractChar);
    }
    public static String var(String var1){
        return var1;
    }
    public static void addition(int num1,int num2){
        int result =num1+num2;
        System.out.println(result);
    }
    public static void num1(float num1,float num2){
        float result = num1+num2;
        System.out.println(result);
    }
    public static void num2(char a){
        float result = a;
        System.out.println(result);
    }
    public static void num3(long a1){
        float result = a1;
        System.out.println(result);
    }
    public static float substract(float num1,int num2){
        float result =num1-num2;
        return result;
    }
    public static float substractForChar(float num1,char num3){
        float result = num1 - num3;
        return result;
    }

}