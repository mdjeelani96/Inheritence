package arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declare Arraylist
		//ArrayList al = new ArrayList(); // to store duplicate objects or duplicate elements and accept heterogeneous data
		//ArrayList <integer> al = new ArrayList <integer>(); // to store only numbers 
		//ArrayList <string> al = new ArrayList <string>(); // suppose i want to store only strings 
        //List al = new ArrayList();
	ArrayList al=new ArrayList();
	
	
	
	//add new elements to arraylist
	al.add(10000);
	al.add("good bye to bangalore");
	al.add(20.7);
	al.add('K');

	System.out.println(al);

	//size() if i want to print how many elements are in arraylist
	System.out.println("number of elements in array list:"+al.size());//4
	
	//remove
	al.remove(1); // here 0 is index
	//al.remove("good bye to"); //here good bye to is element
	System.out.println("after removing element from array list:"+al);
	
	
	}

}
