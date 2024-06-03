public class Employee {
   private String name;
   private int idNumber;
   private String department;
   private String position;
   
   public Employee() {  //no-arg constructor
      name = "";
      idNumber = 0;
      department = "";
      position = "";
   }

   public Employee(String nam, int id, String dept, String pos) {
      name = nam;
      idNumber = id;
      department = dept;
      position = pos;
   }
   
   public Employee(String nam, int id) {
      name = nam;
      idNumber = id;
      department = "";
      position = "";
   }
   //mutators
   public void setName(String nam) {
      name = nam;
   }
   public void setID(int id) {
      idNumber = id;
   }
   public void setDept(String dept) {
      department = dept;
   }
   public void setPos(String pos) {
      position = pos;
   }
   
   //accessors
   public String getName() {
      return name;
   }
   public int getID() {
      return idNumber;
   }
   public String getDept() {
      return department;
   }
   public String getPos() {
      return position;
   }
}