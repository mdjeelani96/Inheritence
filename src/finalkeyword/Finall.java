package finalkeyword;

 class K{
	public final void show() { // if you make method final no one can overide it 

		System.out.println( "in K show ");
	}
	public void add(int a, int b) {
		System.out.println(a+b);	
	}
	public void add(String string) {
		// TODO Auto-generated method stub
		
	}
}


public class Finall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
K obj = new K();
obj.show();
obj.add(4, 5);
	}

}
 // we can use final keyword with  variable to make it constant
// we can use final keyword to class to stop inheritance
// we can use final keyword to method to stop overriding