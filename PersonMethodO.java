public class PersonMethodO extends PersonMethod{
    
    public String getDetails(String section){
        if(section.equals("A")){
            return "10 members belonging to A section";
        }else if(section.equals("B")){
            return "20 members belonging to B sections";
        }
        return getDetails();
    }
}
