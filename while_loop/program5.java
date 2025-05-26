package while_loop;

// Write a Java program to print all positive integers less than 100 that are not divisible by 2, 3, 4, or 5.
class Pro5{
	public static void main(String[] args){
		for(int i=1;i>0;i++){
			if(i%2==0 || i%3==0 ||i%4==0 || i%5==0){
				continue;
			}
			if(i==100){
				break;
			}
			System.out.println(i+"");
		}
	}
}
