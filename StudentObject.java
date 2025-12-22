public class StudentObject {
    static String course;
    String name;
    int rollno;
    int age;

    public StudentObject(int rollNo,String Sname){
        rollno=rollNo;
        name=Sname;
    }

   public static void main(String args[]){
    StudentObject ST = new StudentObject(123,"Abhi");
    System.out.println(getCourse());
    System.out.println(ST.getName());
    System.out.println(ST.getAge());
    System.out.println(ST.getrollno());
   } 
   public static String getCourse(){
    return course;
   }
   public String getName(){
    return name;
   }
   public int getAge(){
    return age;
   }
   public int getrollno(){
    return rollno;
   }  
}
