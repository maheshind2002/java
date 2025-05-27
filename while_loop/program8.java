package while_loop;

//Write a Java program that counts the number of digits in a given integer.
class Pro10{
	public static void main(String[] args){
		int num = 987654321;
		int count = 0;
		while(num!=0){
			count++;
			num/=10;
		}
		System.out.println(num);
		System.out.println(count);
	}
}