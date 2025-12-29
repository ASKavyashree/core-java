public class Comparsion1 {
    public static void main(String[] args){
        int a=10;
        int b=10;
        String name="abhi";
        System.out.println(a==b);
        String string=new String("abhi");
        System.out.println("Comparing the non string constant way");
        System.out.println(name==string);
        System.out.println(name.equals(string));
        
        String name1 = new String(name);
        System.out.println(name1.equals(name));
        String script=name.concat("spring");
        System.out.println(script);
        String name2=new String();
        System.out.println(name2==name);
        
    }
}
