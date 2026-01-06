public class Son extends Father{
    String course;
    String nickName;
    public Son(){
    }
    public Son(String course,String nickName){
        this.course=course;
        this.nickName=nickName;
    }
    public static void main(String[] args){
        Son son = new Son();
        son.setCourse("HTML");
        son.setName("Abhi");
        System.out.println(son.getCourse());
        System.out.println(son.getName());
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return course;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return super.name;
    }
}
