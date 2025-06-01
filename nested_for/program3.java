package nested_for;
import java.util.*;

// print the number in reverse order
class Pro_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rows : ");
		int row = sc.nextInt();
		for(int i=row;i>=1;i--){
			for(int j=row;j>=i;j--){
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
