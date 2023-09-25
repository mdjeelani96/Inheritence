package polymorphism;

public class Method_Overloading {
String name;
int age;
 public void info(String name) {
	 System.out.println(name);
 }
 public void info(int age ) {
	 System.out.println(age);
	 
 }
public void info(String name, int age) {
	System.out.println("name :" +name+ "/"+"age"+ age );
	
}
public static void main(String[] args) {
	Method_Overloading n1 = new Method_Overloading();
	n1.info("jeelani", 27);
}}