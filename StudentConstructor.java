public class StudentConstructor {
    
    int rollno;
    String firstname;
    String secondname;
    String course;
    
    public StudentConstructor(){

    }
    public StudentConstructor(int rollno,String course){
        this.rollno=rollno;
        this.course=course;
    }
    public StudentConstructor(String firstname, String secondname){
        this.firstname=firstname;
        this.secondname=secondname;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getCourse(){
        return course;
    }
    public void setFirstName(String firstname){
        this.firstname=firstname;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setsecondName(String secondname){
        this.secondname=secondname;
    }
    public String getSecondName(){
        return secondname;
    }
}
