package string_pack;



public class startswith_example {

	public static void main(String[] args) {
		startswith_example mom = new startswith_example();
		mom.ball();
		startswith_example.cricket();
		mom.bat();
		startswith_example.floor();
	}
public void ball() {
String fullname = "Nasrin Akter";
boolean t = fullname.startsWith("Nasrin");
System.out.println(t);
	
	
	
}
public static void cricket() {
String myline = "I live in New York";
boolean h = myline.startsWith("I");
	System.out.println(h);
	
	
}
public void bat() {
String name = "New York";
boolean h = name.startsWith("York");
	System.out.println(h);
	
}
public static void floor() {
String place = "Bangladesh is my motherland";									
boolean m = place.startsWith("my");
System.out.println(m);
	
}
	
}
