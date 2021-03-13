public class PatientController{
   public static void main(String args[]){
   Patient p1 = new Patient();
   System.out.println("Patient1 new details");
   System.out.println(p1.name);
   System.out.println(p1.age);
   System.out.println(p1.phone);
   System.out.println("Asssign values to p1 using setters");
   p1.setName("vishnu");
   p1.setAge(255);
   p1.setPhone(9000000002L);
    System.out.println(p1.name);
   System.out.println(p1.age);
   System.out.println(p1.phone);
	
   Patient p2 = new Patient();
   p2.setName("king");
   p2.setAge(500);
   p2.setPhone(9000000056L);
   System.out.println("Patient2 new details");
   System.out.println(p2.name);
   System.out.println(p2.age);
   System.out.println(p2.phone);
 }
}