package inheritanceconcept_1;

class Grandfather{ // multiple level inheritance
	void scooter() {
		System.out.println("Bajaj");
	}
}
class Dad extends Grandfather{
 void car() {
	 System.out.println("RollsRoyace");
 }
}
 class Son extends Dad {
	 void bike() {
		 System.out.println("Kawasaki");
	 }
 }
 
 
public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Son s = new Son();
	s.scooter();
	s.car();
	s.bike();
	}}

