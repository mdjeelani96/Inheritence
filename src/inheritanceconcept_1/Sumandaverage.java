package inheritanceconcept_1;

import java.util.Scanner;

public class Sumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements you want to store: ");
	int size = sc.nextInt();//10
	
	int arr[] = new int [size];
	
	System.out.println("enter the elements of the array:");
	int i, even_sum = 0, odd_sum =0, even_count =0, odd_count =0;
	float even_avg = 0.f, odd_avg = 0.f;
	for(i=0; i<size; i++)
		arr[i] = sc.nextInt();
	
	for(i=0; i<size; i++)
		if(arr[i] % 2 == 0) {
			even_sum = even_sum + arr[i];
			even_count++;
		}else {
			odd_sum = odd_sum + arr[i];
			odd_count++;
		}
	even_avg = even_sum / even_count;
	odd_avg = odd_sum / odd_count;
	
	System.out.println("Sum of Even numbers =" + even_sum );
	System.out.println("Sum of Odd numbers =" + odd_sum);
	System.out.println("total number of even numbers in array  = : " + even_count);
	System.out.println("total number of numbers in array  = : " + odd_count);
	System.out.println("Average of Even numbers = : " + even_avg);
	System.out.println("Average of Odd numbers = : " + odd_avg);
	
	
	
	}}
