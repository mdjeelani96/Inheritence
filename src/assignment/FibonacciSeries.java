package assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n, a=1,b=1;
  n=0;
  System.out.print("1 1 ");
  while(n<=989)
  {
	  
	  n=a+b;
	  System.out.print(n + " ");
	  a=b;
	  b=n;
  }
	}

}
