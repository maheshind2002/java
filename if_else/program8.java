package if_else;
// checking divisibility by 3 numbers
class Divisible_8{
	public static void main(String[] args){
		int x = 100;
		if(x%2==0 && x%5==0 && x%10==0){
			System.out.println(x+ "  number is divisible by 2,5 and 10");
		}
		else if(x%2==0){
			System.out.println(x+ " number is divisible by 2 only");
		}
		else if(x%5==0){
			System.out.println(x+ "number is divisible by 5");
		}
		else if (x%10==0){
			System.out.println(x+ "number is divisible by 10");
		}
		else if(x%2==0 && x%5==0){
			System.out.println(x+ "number is divisible by 2 and 5");
		}
		else if(x%2==0 && x%10==0){
			System.out.println(x+ "number is divisible by 2 and 10");
		}
		else if(x%5==0 && x%10==0){
			System.out.println(x+ "number is divisible by 5 and 10");
		}
		else{
			System.out.println("given number is not divisible by  2,5 and 10");
		}
	}
}
