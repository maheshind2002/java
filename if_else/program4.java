package if_else;
// checking the alphabet is it in lowercase or uppercase
class CaseCheck{
	public static void main(String[] args){

		char ch = '1';
		
		if(ch>='a' && ch<='z')
		{
			System.out.println("Given alphabate is in lower case");
		}
		else if(ch>=65 && ch<=90){
		       System.out.println("upper case");
		}	       

		else{
			System.out.println("enter valid number ");
		}
	}
}

