package while_loop;

// Write a Java program that reverses a given integer number and displays the reversed number along with the original number
class Pro4{
	public static void main(String[] args){
		int number = 301071;
		int numVal=0;
		int temp=number;
		while(temp!=0){
			numVal = numVal*10+(temp%10);
			temp/=10;
		}
		System.out.println(temp);
		System.out.println(numVal);
		System.out.println(number);
	}
}