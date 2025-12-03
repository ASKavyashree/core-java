class TrafficSignal{
    public static void main(String[] args ){
        int signal=5;
        String traffic = checkTrafficSignal(signal);
        System.out.println(traffic);
    }
    public static String checkTrafficSignal(int signal){
        if(signal==0){
            return "Stop";
        }
        if(signal==1){
            return "Ready to go";
        }
        if(signal==2){
            return "Go";
        } 
        return "invalid signal option";
    }
}