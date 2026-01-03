public class EmployeeInhertiance extends Employees {
    String department;
    int age;

    public void setDepartment(String department){
        this.department =department;
    }
    public String getDepartment(){
        return department;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
