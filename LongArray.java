class LongArray{
    public static void main(String[] args){
        long val[]={100000000L,200000000L,300000000L,400000000L,500000000L,600000000L,700000000L,800000000L,900000000L,1000000000L};
        System.out.println(val[0]);
        System.out.println(val[1]);
        System.out.println(val[2]);
        System.out.println(val[3]);
        System.out.println(val[4]);
        System.out.println(val[5]);
        System.out.println(val[6]);
        System.out.println(val[7]);
        System.out.println(val[8]);
        System.out.println(val[9]);
        

        System.out.println("Array of ForLoop");
        for(int i=0;i<=val.length-1;i++){
            System.out.println(val[i]);
        }

        System.out.println("Array of WhileLoop");
        int i=0;
        while(i<=val.length-1){
            System.out.println(val[i]);
            i++;
        }

        System.out.println("Array of DoWhileLoop");
        int s=0;
        do{
            System.out.println(val[s]);
            s++;
        }while(s<=val.length-1);
    }
}