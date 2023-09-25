package activitybyteamlead;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  cons c1 = new cons();
  c1.japan();

	}

}
class cons {
 cons()     // un arugumented constructors
 {System.out.println("it is constructors");
	}
	cons(int g, int b) // argumented constructor
	{
		System.out.println(" addition of "+g+" and "+b+" is: "+(g+b));
	}
public void japan() {
		System.out.println("japan");
		
	}}