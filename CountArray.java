public class CountArray {
    public static void main(String[] args){
        int a[]={10,2,5,6,7,10,20,5};
        int target=10;
        int count=0;

        for(int i=0;i<=a.length-1;i++){
            if(a[i]==target){
                count++;
            }
        }
        System.out.println("Number of 10 is present "+count);
    }
}
