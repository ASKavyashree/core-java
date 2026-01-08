public class PersonRunner {
    public static void main(String args[]){
        PersonMethodO person = new PersonMethodO();
        System.out.println(person.getDetails());
        System.out.println(person.getDetails("A"));
        System.out.println(person.getDetails("b"));
    }
}
