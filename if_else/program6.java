
package if_else;
// checking divisibility by two number
class Divide {
	public static void main(String[] args){
		int num = 9;

		if(num%3==0 && num%7==0){
			System.out.println("NUmber is divisible by 3 and 7");
		}
		else if(num%3==0){
			System.out.println("Number is divisible by 3");
		}
		else if(num%7==0){
			System.out.println("Number is divisible by 7");
		}
		else
		{
			System.out.println("nothing");
		}
	}
}
