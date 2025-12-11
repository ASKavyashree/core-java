class StringArray{
    public static void main(String[] args){
        String a[]={"java","XML","Python","HTML","CSS","JavaScript","SQL","R","C++","C"};
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

        System.out.println("Array of String in for loop");
        for(int i=0;i<a.length-1;i++){
            System.out.println(a[i]);
        }

        System.out.println("Array of String in WhileLoop");
        int j=0;
        while(j<=a.length-1){
            System.out.println(a[j]);
            j++;
        }

        System.out.println("Array of String in Do WhileLoop");
        int k=0;
        do{
            System.out.println(a[k]);
            k++;
        }while(k<=a.length-1);
    }
}