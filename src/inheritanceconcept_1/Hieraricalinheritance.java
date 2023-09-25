package inheritanceconcept_1;
class A{
	void input()
	{System.out.println("enter your name: ");
	}
}
class B extends A {
	void show()
	{
		System.out.println("my name is jeelani");
	}
}
class C extends A{
	void disp()
	{
		System.out.println("my name is mohammed");
	} 
}

public class Hieraricalinheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B r=new B();
C r2=new C();

r.input(); r.show();
r2.input(); r2.disp();
	}

}
