public class EmployeeRunner {
    public static void main(String[] args){
        EmployeeConstructor employee = new EmployeeConstructor();

        System.out.println(employee.getName());
        employee.setCity("Bangalore");
        System.out.println(employee.getCity());
        

        EmployeeConstructor emp1=new EmployeeConstructor("Ram","Mysore");
        System.out.println(emp1.getName());
        System.out.println(emp1.getCity());

        emp1.setCity("Kolar");
        System.out.println(emp1.getCity());

        EmployeeConstructor emp2 = new EmployeeConstructor();
        System.out.println(emp2.getName());
        System.out.println(emp2.getidCard());

    }
}
