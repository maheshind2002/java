package while_loop;
// use of while loop print no from 1 to 9
class Pro3{
	 public static void main(String[] args){
		 int x=0;
		 while(true){
			 ++x;
			 if(x%10==0)
				 break;
			 System.out.println(x);
		 }
	 }
 }