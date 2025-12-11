class CharArray{

    public static void main(String[] args){
        char a[]={'a','b','c','d','e','f','g','h','i','j'};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[5]);
        System.out.println(a[6]);
        System.out.println(a[7]);
        System.out.println(a[8]);
        System.out.println(a[9]);
        

        System.out.println("Array of ForLoop");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

        System.out.println("Array of While loop");
        int j = 0;
        while(j<=a.length-1){
            System.out.println(a[j]);
            j++;
        }

        System.out.println("Array of do while loop");
        int k=0;
        do{
            System.out.println(a[k]);
            k++;
        }while(k<=a.length-1);
    }
}