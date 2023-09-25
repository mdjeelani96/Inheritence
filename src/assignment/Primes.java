package assignment;

public class Primes {
	public static void primenumbers(int number) {
			
for(int i=2; i<=number; i++) { // outer forloop
	int count=0;              // declare var
	for(int p=2; p<i; p++) { // inner forloop
		if(i%p==0) { // arthimatic operators
			count++;   // increment 
			
		}
	}
         if(count==0) { // verify conditions
        	 System.out.print(i+" "); // calling the conditios
         }}}      	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primes.primenumbers(100); // calling the both method
		
	}}
