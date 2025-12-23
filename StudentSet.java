public class StudentSet {
    static String course;
    String name;
    String rollno;
    int marks;

    public StudentSet(){

    }
    public StudentSet(String name,String rollno,String course){
        this.name=name;
        this.course=course;
        this.rollno=rollno;
    }

    public static void main(String args[]){
        StudentSet student = new StudentSet("Kavya","97","Python");
        System.out.println(student.getCourse());
        System.out.println(student.getName());
        student.setMarks(89);
        System.out.println(student.marks);

    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
}
