class FloatArray{
    public static void main(String[] args){
        float a[]={1.2f,3.2f,4.3f,4.2f,5.2f,5.6f,4.5f,6.8f,9.6f,4.3f};
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

        System.out.println("Array of forloop");
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
        System.out.println("Array of WhileLoop");
        int j=0;
        while(j<=a.length-1){
            System.out.println(a[j]);
            j++;
        }

        System.out.println("Array of DoWhileLoop ");
        int k=0;
        do{
            System.out.println(a[k]);
            k++;
        }while(k<=a.length-1);
    }
}