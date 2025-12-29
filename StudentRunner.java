public class StudentRunner {
    public static void main(String args[]){
       StudentConstructor student = new StudentConstructor();
       
       student.setCourse("java");
       System.out.println(student.getCourse());
       
       StudentConstructor student1 = new StudentConstructor(23,"python");
       System.out.println(student1.getCourse());
       
       StudentConstructor student2 =new StudentConstructor("Kavya","Shree");
       System.out.println(student2.getFirstName());
       System.out.println(student2.getSecondName());
    }
}
