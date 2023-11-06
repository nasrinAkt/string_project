package string_pack;

public class equals_example {

	public static void main(String[] args) {
		equals_example machine	= new equals_example();
		machine.doll();
		
		equals_example.doll2();
		
	}

public void doll() {
String a = "today is hot";
String b = "today is hot";
    boolean c = a.equals(b);
	System.out.println(c);
	
	
}
public static void doll2() {
String a = "My name is Nasrin";
String b = "My name is Nasrin";
boolean c = a.equals(b);	
System.out.println(c);	
}
	
	
	
	
}
