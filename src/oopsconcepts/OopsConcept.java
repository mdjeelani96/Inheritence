package oopsconcepts;
class pen {
	String color;
	String type; // ballpoint; gel
	
	public void write() {
		System.out.println("writing alphabet");
	}
	public void printcolor() {
		System.out.println(this.color); 
	}
	
}
public class OopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
pen pen1 = new pen();
		pen1.color = "blue";
		pen1.type = "gel";
		pen1.write();
		
		pen pen2 = new pen();
		pen2.color = "black";
		pen2.type = "ballpoint";
		
		
		pen1.printcolor();
		pen2.printcolor();               
		
	}}
