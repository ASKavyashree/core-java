public class EvenOddArray {
    public static void main(String[] args){
        int a[]={2,3,4,5,6,67};
        for(int i=0;i<a.length-1;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd");
        for(int j=0;j<=a.length-1;j++){
            if(a[j]%2!=0){
                System.out.println(a[j]);
            }
        }
    }
}
