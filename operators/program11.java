package operators;


class Switchdemo2{
	public static void main(String[] args){
		int num = 50;
		
		switch(num){
			case 25+25 :
				System.out.println("25+25");
				break;
			case 30+25:
				System.out.println("30+20");
				break;
			case 20+40:
				System.out.println("20+30");
				break;
			default:
				System.out.println("ghya shett");
		}
	}
}