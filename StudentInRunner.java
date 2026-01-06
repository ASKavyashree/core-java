public class StudentInRunner {
    public static void main(String[] args){
        StudentIntertiance student = new StudentIntertiance("Kavya",23);
        student.setMarks(654);
        System.out.println(student.getMarks());
        System.out.println(student.getAge());
        System.out.println(student.getName());
    }
}
