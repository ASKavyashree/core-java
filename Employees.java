public class Employees {
   String name;
   int salary; 

   public Employees(){

   }
   public Employees(String name,int salary){
    this.name=name;
    this.salary=salary;
   }
   public static void main(String main[]){
    Employees employee = new Employees("Abhi",23483);
    System.out.println(employee.getName());
    System.out.println(employee.getSalary());
   }
   public void setName(String name){
        this.name=name;
   }
   public String getName(){
    return name;
   }
   public void setSalary(int salary){
    this.salary=salary;
   }
   public int getSalary(){
    return salary;
   }
}
