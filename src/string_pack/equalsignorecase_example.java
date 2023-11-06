package string_pack;

public class equalsignorecase_example {

	public static void main(String[] args) {
		
		equalsignorecase_example car1 = new equalsignorecase_example();
		car1.car();
		
		equalsignorecase_example.name();

	}
public void car() {
String a = "I love new york";
String b = "i Love New york";
boolean c = a.equalsIgnoreCase(b);
System.out.println(c);	
	
}
public static void name() {
String a = "I want to be a bird";
String b = "i want to be a Bird";
boolean c = a.equalsIgnoreCase(b);
System.out.println(c);	
	
	
}	
	
	
	
	
	
	
	
	
	
	
}
