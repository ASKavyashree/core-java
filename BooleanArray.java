class BooleanArray{
    public static void main(String[] args){
        boolean b[]={true,false,true,false,true,true,false,true,true,false};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);
        System.out.println(b[5]);
        System.out.println(b[6]);
        System.out.println(b[7]);
        System.out.println(b[8]);
        System.out.println(b[9]);

        System.out.println("Array of boolean values by for loop");
        for(int i =0;i<=b.length-1;i++){
            System.out.println(b[i]);
        }

        System.out.println("Array of boolean values by while loop");
        int j=0;
        while(j<=b.length-1){
            System.out.println(b[j]);
            j++;
        }

        System.out.println("Array of boolean values by Do while loop");
         int k=0;
         do{
            System.out.println(b[k]);
            k++;
         }while(k<=b.length-1);

        }
}