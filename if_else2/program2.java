package if_else2;
// checking that the given number is in the table of 13 or multiple of 13 or not
class Table{
	public static void main(String [] args){
		int t = 143;
		
		if (t%13==0){
			System.out.println("the number is in table of 13");
		}
		else{
			System.out.println("given number is not in table");
		}
	}
}
