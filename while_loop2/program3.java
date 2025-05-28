package while_loop2;
// finding the numbers which are divisible by 4 and 7  in between 50 to 100
class Pro3{
	public static void main(String[] args){
		int num = 100;
		while(num>=50){
			if(num%4==0 && num%7==0){

			System.out.println(num);
			}
			num--;
		}
	}
}
