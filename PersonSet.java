public class PersonSet {
    static String course;
    String name;
    int rollno;
    String section;

    public PersonSet(){

    }
    public PersonSet(int rollno,String name,String section){
        this.name=name;
        this.rollno=rollno;
        this.section=section;
    }
        public static void main(String args[]){
        PersonSet person = new PersonSet(45,"Anand","A section");
        System.out.println(person.getName());
        person.setCourse("Java");
        System.out.println(course);
        person.setRollno(34);
        System.out.println(person.rollno);

    }
    public void setCourse(String course){
        this.course=course;
    } 
    public String getName(){
        return name;
    }
    public String getSection(){
        return section;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
}
