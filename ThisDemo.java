public class ThisDemo{
int id;
String name;
   
   public ThisDemo(){
   System.out.println("Default constructor");
   }
   
   public ThisDemo(int id,String name){
   this();
   System.out.println("Parameterised constructor");
   this.id = id;
   this.name = name;
   }
    public void getMyDetails(){
	System.out.println(id);
	System.out.println(name);

	}
}   