package string_pack;

public class string1 {

	public static void main(String[] args) {
		string1 girl = new string1();
		girl.boy();
		girl.baby();
		string1.bird();
		string1.sky();
	}
public void boy() {
	
String mycourse = "Automation course";	
boolean t =	mycourse.startsWith("Automation");
System.out.println(t);	

}
public void baby() {
String a = "Nasrin Akter";	
boolean h = a.endsWith("Akter");	
System.out.println(h);	
}
public static void bird() {
String actual = "I love java";
String expected = "java";
boolean h = actual.equals(expected);
	System.out.println(h);
	
}
public static void sky() {
String actual = "I love java";
String expected = "i love java";
boolean h = actual.equalsIgnoreCase(expected);
System.out.println(h);	
	
	
}


}
