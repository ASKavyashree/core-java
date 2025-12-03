public class Marks {
    public static void main(String args[]){
        int marks=35;
        String Grade=grade(marks);
        System.out.println(Grade);
    }
    public static String grade(int marks){
        if(marks==90){
            return "A++ Grade";
        }
        if(marks==80){
            return "A Grade";
        }
        if(marks==70){
            return "B++ Grade";
        }
        if(marks==60){
            return "B Grade";
        }
        if(marks==50){
            return "C Grade";
        }
        if(marks==35){
            return "Fail";
        }
        return "Invaild Number";
    }
}
