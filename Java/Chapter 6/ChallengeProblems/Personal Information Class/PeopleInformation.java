public class PeopleInformation {
   public static void main(String[] args) {
      PersonalInformation person1 = new PersonalInformation("Porter Sampson", "110 High Pointe Dr.", 23, "(801)900-1938");
      PersonalInformation person2 = new PersonalInformation("Cole Sampson", "110 High Pointe Dr.", 19, "(801)376-4588");
      PersonalInformation person3 = new PersonalInformation("Austin McGiven", "235 Alpine Ln.", 28, "(801) 674-4959");
      
      System.out.println("Person 1\n" + "Name: " + person1.getName() + "\nAddress: " + person1.getAddress() + "\nAge: " + person1.getAge() + "\nPhone Number: " + person1.getPhone() + "\n");
      System.out.println("Person 2\n" + "Name: " + person2.getName() + "\nAddress: " + person2.getAddress() + "\nAge: " + person2.getAge() + "\nPhone Number: " + person2.getPhone() + "\n");
      System.out.println("Person 3\n" + "Name: " + person3.getName() + "\nAddress: " + person3.getAddress() + "\nAge: " + person3.getAge() + "\nPhone Number: " + person3.getPhone() + "\n");
   
   }
}