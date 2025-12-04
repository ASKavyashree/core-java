public class Grade {
    public static void main(String args[]){
        int marks=90;
        calculatedGrade(marks);
    }
    public static void calculatedGrade(int marks){
        if(marks>90){
            System.out.println("Grade is A++");
        }else if(marks>=80){
            System.out.println("Grade is A");
        }else if(marks>=70){
            System.out.println("Grade is B++");
        }else if(marks>=60){
            System.out.println("Grade is B");
        }else if(marks>=35){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
        }
    }
}
