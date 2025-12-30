public class ComparsionArray {
    public static void main(String args[]){
        int a[]={12,23,56,78};
        
        String b[]={"java","python","c++","HTML"};
        for(int i=0;i<a.length;i++){
            if(a[i]==56){
                System.out.println("true");
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i] == "java"){
                System.out.println("true");
            }
        }
    }
}
