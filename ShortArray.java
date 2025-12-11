class ShortArray{
    public static void main(String[] args){
        short a[]={10,20,30,40,50,60,70,80,90,100};
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

        System.out.println("Array is ForLoop");
        for(short i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

        System.out.println("Array is While Loop");
        short i=0;
        while(i<=a.length-1){
            System.out.println(a[i]);
            i++;
        }

        System.out.println("Array is Do While Loop");
        short j=0;
        do{
            System.out.println(a[j]);
            j++;
        }while(j<=a.length-1);
    }
}