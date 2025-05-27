package while_loop;

//Write a Java program that repeatedly decrements a number from 10 to 0, multiplying a temporary variable by the current
// number in each step and printing the result.
class Pro9{
	public static void main(String[] args){
		int num=10;
        int temp=0;
		while(num!=0){
			num=num-1;
			
			temp*=num;
			System.out.println(temp);
		}
		System.out.println(num);
	}
}
