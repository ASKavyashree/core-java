public class SbiRunner {
    
    public static void main(String[] args){
        SbiBankMethod sbi = new SbiBankMethod();
        System.out.println(sbi.getIntersetRate("homeloan"));
        System.out.println(sbi.getIntersetRate("vechileloan"));
    }
}
