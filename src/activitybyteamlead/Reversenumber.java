package activitybyteamlead;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 987654, reverse =0;
while(number !=0) {
	int remainder = number % 10;
	//System.out.println(remainder);
	reverse = reverse * 10 + remainder; //4 //45
	System.out.println(reverse);
	number = number/10; //98765
	System.out.println(number);
}
System.out.println("the reverse of given number is: "+ reverse);
	}

}
