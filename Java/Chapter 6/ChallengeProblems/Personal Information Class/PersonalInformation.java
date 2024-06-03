public class PersonalInformation {
   private String name;
   private String address;
   private int age;
   private String phoneNumber;
   
   //constructors
   public PersonalInformation() {
      name = "";
      address = "";
      age = 0;
      phoneNumber = "";
   }
   public PersonalInformation(String n, String add, int old, String phone) {
      name = n;
      address = add;
      age = old;
      phoneNumber = phone;
   }
   
   //mutators
   public void setName(String n) {
      name = n;
   }
   public void setAddress(String add) {
      address = add;
   }
   public void setAge(int old) {
      age = old;
   }
   public void setPhone(String phone) {
      phoneNumber = phone;
   }
   //accessors
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public int getAge() {
      return age;
   }
   public String getPhone() {
      return phoneNumber;
   }
}