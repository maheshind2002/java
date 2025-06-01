package nested_for;

// prdering to the number print that only alphabtes
import java.util.*;
class Pro_4{
	public static void main(String[] args){
		char cha='A';
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row : ");
		int row = sc.nextInt();
		for(int i=1;i<=row;i++){
			char ch=cha;
			for(int j=i;j<=i;j++){
				System.out.print(ch+" ");
				ch++;
			}
			cha++;
			System.out.println();
		}
	}
}
