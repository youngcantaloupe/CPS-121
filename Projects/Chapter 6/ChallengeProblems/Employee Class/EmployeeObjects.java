public class EmployeeObjects {
   public static void main(String[] args) {
      
      Employee employee1 = new Employee();
      employee1.setName("Susan Meyers");
      employee1.setID(47899);
      employee1.setDept("Accounting");
      employee1.setPos("Vice President");
      
      Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
      
      Employee employee3 = new Employee("Joy Rogers", 81774);
      employee3.setDept("Manufacturing");
      employee3.setPos("Engineer");
      
      System.out.println("Employee #1");
      System.out.println("Name: " + employee1.getName());
      System.out.println("ID: " + employee1.getID());
      System.out.println("Department: " + employee1.getDept());
      System.out.println("Position: " + employee1.getPos());
      System.out.println();
      
      System.out.println("Employee #2");
      System.out.println("Name: " + employee2.getName());
      System.out.println("ID: " + employee2.getID());
      System.out.println("Department: " + employee2.getDept());
      System.out.println("Position: " + employee2.getPos());
      System.out.println();
      
      System.out.println("Employee #3");
      System.out.println("Name: " + employee3.getName());
      System.out.println("ID: " + employee3.getID());
      System.out.println("Department: " + employee3.getDept());
      System.out.println("Position: " + employee3.getPos());
   }
}