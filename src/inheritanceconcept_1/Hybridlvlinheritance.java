package inheritanceconcept_1;

interface Reliance {
	void gift();
}
interface Reliancefresh extends Reliance {
	void RelianceSalary();
}
interface Bigbasket{
	void Bigbasketsalary();
	
}
class Employee implements Reliancefresh, Bigbasket {
	public void RelianceSalary() {
		System.out.println("Reliance Salary Is : 19000rs");
	}
	public void Bigbasketsalary() {
		System.out.println("bigbasketsaalary is : 25000rs");
		
	}
	public void gift() {
		System.out.println("Reliance gift is : 6000rs bonus");
		
	}
}


public class Hybridlvlinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Reliancefresh r = new Employee();
r.RelianceSalary();
Bigbasket b=new Employee();
b.Bigbasketsalary();
Reliance r1 = new Employee();
r1.gift();

	}}
