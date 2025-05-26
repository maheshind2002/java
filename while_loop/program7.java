package while_loop;

// Write a Java program to print all uppercase English alphabets (A–Z) except the vowels (A, E, I, O, U).
class Pro7{
	public static void main(String[] args){
		for(char ch = 65;ch<91;++ch){

			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				continue;
			}

			       System.out.println(ch);
		}
	}
}	