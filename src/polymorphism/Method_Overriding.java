package polymorphism;
class K{
	public void part() {
		System.out.println("print K");
		
	}
}

class L extends K{
	public void part1() {
		super.part();
		
	}
	@Override
	public void part() {
		System.out.println("print L");
	}
}



public class Method_Overriding extends K{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overriding n2 = new Method_Overriding();
		n2.part();
	}

}
