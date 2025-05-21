package if_else2;

class Carrier{
	public static void main(String[] args){
		int marks = 85;
		if(marks>=85){
			System.out.println("Computer");
		}
		else if(marks>=65 && marks<85){
			System.out.println("mechanical");
		}
		else if(marks>=35 && marks<=64){
			System.out.println("Civil");
		}
		else{
			System.out.println("better luck next time");
		}
	}
}
