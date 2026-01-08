public class thingM extends thing{
    
    public String getThing(String book){
        if(book.equals("textbook")){
            return "Available of 6 books";
        }else if(book.equals("notebook")){
            return "Singleline Book ";
        }
        return getThing();
    } 
}
