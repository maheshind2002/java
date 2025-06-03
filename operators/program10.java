package operators;

class Logical{
	public static void main(String[] args){
		int x = 4;
		int y = 6;
		System.out.println((x<y) && (y>x));
		System.out.println((x==y) || (x<=y));
		System.out.println((x++ <= --x) || (++x >y--));
	}
}
