package staticekeyword;
class Emp{
	int eid; //employee id
	int salary;
	 static String MD;
	
	 static { // static block executed when you load a class
		 MD = "suresh";
		 System.out.println("in static");
	 }
	 
	public Emp() { //Constructor works when you create an object
		
		eid = 1;
		salary = 300;
		System.out.println("in constructor");
		
	}
	public void show() {
		System.out.println(eid + " : " + salary+ " : "  +MD);
		
	}
	
}
public class Staticdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Emp jeelani = new Emp();
jeelani.eid = 9;
jeelani.salary = 9000;
Emp.MD = "suresh";


Emp amarnath = new Emp();
amarnath.eid = 6;
amarnath.salary = 10000;
Emp.MD = "suresh"; // static variable we don't need object

Emp.MD = "Latha";
jeelani.show();
amarnath.show();
	}

}
