package assignment;

public class ReverseLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// My Name is Jeelani
				// Jeelani is Name My
				
				String str = " My Name is Jeelani";
				String strl =""; // create one more string
				String a[] = str.split(" "); //string array 
				
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i] + " ");
				}
						System.out.println("");
						
						for(int i=a.length-1;i>=0;i--)
						{
							strl = strl + a[i] +" ";
						}
						System.out.println(strl); // calling 
		}}
