package superkeyword;

public class Superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj = new B(8);
	}

}
class A extends Object {// super class
	public A() { //super()
		System.out.println("in constructor A");
	}
	public A(int i) {
		
		System.out.println("in constructor A class");
	}
}
class B extends A { // sub class
	 public B() {
		 System.out.println("constructor B");
	 }
	 public B(int i) {
		 super(i);// if we pass i here it will jump to parent class A and it will call constructor
		 System.out.println("in constructor B class");
	 }
}// super keyword 