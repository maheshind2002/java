package while_loop;


// Write a Java program that uses a while loop to iterate through numbers from 2 to 10 (inclusive). 
//During each iteration, check if the current number is even. If it is even, print the dollar sign symbol $ followed by a newline.
// If the number is odd, print a blank line.
class Pro8{
	public static void main(String[] args){
		int i=1;
		while(i++<10){
			if(i%2==0){
				System.out.print("$");
			}
			else{
				System.out.print("");
			}
			System.out.println();
		}
	}
}
