package origin;

public class Employee {

   

      private String name;

      private String department;

      private double salary;



    public Employee (String name1, String name, double amount) {
        
         this.name = name1;
         this.department = name;
         this.salary = amount;

          }

    public String getDepartment() {

         return this.department;

          }

    public double getSalary() {
 
         return this.salary;

          }

    public void changeDepartment(String dept) {
          
          dept = department;
         
         }

    public void increaseSalary(double amount) {

          this.salary = salary + amount;

         }

     public void decreaseSalary(double amount) {

          this.salary = salary - amount;

          }

                       

                                      }