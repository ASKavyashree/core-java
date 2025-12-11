class IntArray{
    public static void main(String args[]){
        int a[]={20,38,47,57,39,43,32,23,56,89};
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

        System.out.println("Array using Forloop");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }

        System.out.println("Array using WhileLoop");
        int i=0;
        while(i<=a.length-1){
            System.out.println(a[i]);
            i++;
        }
        System.out.println("Array using DoWhileLoop");
        int k=0;
        do{
            System.out.println(a[k]);
            k++;
        }while(k<=a.length-1);
    }
}