package operators;

class Switchdemo{
	public static void main(String[] args){
		int x = 5;
			
		switch(x){
			case 1:
				System.out.println("one");
				break;
			
			case 5 :
				System.out.println("Five");
				break;
			
			case 3 :
				System.out.println("three");
				break;
			
			case 4 : 
				System.out.println("four");
				break;
			
			case 2:
				System.out.println("two");
				break;

			default:
				System.out.println("Deafault");
		}
	}
}
