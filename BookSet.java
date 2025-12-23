public class BookSet {
    static String themes;
    int bookid;
    String name;
    String price;

    public BookSet(){

    } 
    public BookSet(int bookid,String price){
        this.bookid=bookid;
        this.price=price;
    }
    public static void main(String args[]){
        BookSet book = new BookSet(122,"234");
        book.setName("Harry potter");
        System.out.println(book.name);
        System.out.println(book.getPrice());
        System.out.println(book.getBookid());
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPrice(){
        return price;
    }
    public int getBookid(){
        return bookid;
    }
}
