package while_loop2;
 // print in reverse order of 50 (-5) everytime.
class Pro2{
	public static void main(String[] args){
		int table = 50;
		while(table>=10){
			if(table%5==0){
				System.out.println(table);
			}
			table--;
		}
	}
}
