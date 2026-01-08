public class Addition {
    int a;
    int b;
    int result;

    public int getAdd(){
        return result;
    }
    public int getAdd(int a){
        if(a==b){
            System.out.println("equals");
        }else if(a>b){
            System.out.println("A greater than B");
        }
        return result;
    }
}
