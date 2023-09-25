package assignment;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = new String("Shimakh Technology");
		int count=0;
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++) { // for loop
			for ( int j=i+1 ; j<ch.length ; j++) { 
				if(ch[i]== ch[j]) { 
					System.out.println("duplicatecharacters in String are :" +ch[j]);
					count++;
				}
			}
		}
		System.out.println("DuplicateCharacters count :" +count);
	}

}
