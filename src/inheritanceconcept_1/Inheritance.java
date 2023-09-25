package inheritanceconcept_1;

class Parent { //single level inheritance
	public void car () {
		System.out.println("Mustang");
	}}
	
class Childs extends Parent {
	public void bike() {
		System.out.println("Jawa");
		
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Childs c= new Childs();
  c.bike();
  c.car();
	}

}
