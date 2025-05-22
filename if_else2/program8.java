package if_else2;
// claculating the class based on the marks
class Pro8{
	public static void main(String[] args){
		float percentage = 82.97f;
		if(percentage>=75 && percentage<=100){
			System.out.println("Passed : First class");
		}
		else if(percentage>=65 && percentage <=74){
			System.out.println("Passed : Second class");
		}
		else if(percentage>=35 && percentage<=64){
			System.out.println("Passed : Third class");
		}
		else{
			System.out.println("Fail : Better luck next time");
		}
	}
}
