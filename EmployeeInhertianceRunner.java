public class EmployeeInhertianceRunner {
    public static void main(String args[]){
       EmployeeInhertiance employee = new EmployeeInhertiance();
       employee.setAge(34);
       System.out.println(employee.getAge()); 
       employee.setDepartment("CSE");
       System.out.println(employee.getDepartment());
    }
}
