public class HallTicket {
    public static void main(String[] args){
        String hallTicket="No";
        String Card=hallTicket(hallTicket);
        System.out.println(Card);
    }
    public static String hallTicket(String hallTicket){
        if(hallTicket == "Yes"){
            return "Allow to write the exam";
        }
        if(hallTicket == "No"){
            return "Take a permission from HeadMaster";
        }
        return "Write a exam next time";
    }
}
