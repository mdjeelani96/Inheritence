package encapsulation;

class Encap{
	private int value;//data hiding
	public void setvalue(int x)//data abstraction
	{
		value=x;//value=100
	}
	public int getValue() {
		return ++value;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap r=new Encap();
		r.setvalue(100);
		System.out.print(r.getValue());
}}