public class thing {
    String book;
    String pencil;

    public String getThing(){
        return "useful for us";
    }

    public String getThing(String book)
    {
        if(book.equals("textbook")){
            return "Reading purpose";
        }else if(book.equals("noteboook")){
            return "Writing book";
        }
        return getThing();
    }
    public void setBook(String book){
        this.book=book;
    }
    public String getBook(){
        return book;
    }
    public void setPencil(String pencil){
        this.pencil=pencil;
    }
    public String getPencil(){
        return pencil;
    }

}
