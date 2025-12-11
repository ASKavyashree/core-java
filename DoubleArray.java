class DoubleArray{
    public static void main(String args[]){
        double d[]={1.3d,1.8d,6.8d,7.4d,4.6d,7.8d,2.3d,4.3d,9.5d,2.5d};
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
        System.out.println(d[4]);
        System.out.println(d[5]);
        System.out.println(d[6]);
        System.out.println(d[7]);
        System.out.println(d[8]);
        System.out.println(d[9]);

        System.out.println("Array of ForLoop");
        for(int i=0;i<=d.length-1;i++){
            System.out.println(d[i]);
        }

        System.out.println("Array of WhileLoop");
        int j=0;
        while(j<=d.length-1){
            System.out.println(d[j]);
            j++;
        }

        System.out.println("Array of Do While Loop");
        int k=0;
        do{
            System.out.println(d[k]);
            k++;
        }while(k<=d.length-1);
    }
}