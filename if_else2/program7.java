package if_else2;
// calculating profit,loss and discount
class Pro7{
	public static void main(String[] args){
		int cost = 1023;
		int selling = 650;
		int profit = 0;
		int loss = 0;
		if(cost<=selling){
			profit = selling - cost;
			System.out.println(" profit of " + profit);
		}
		else{
			loss = cost-selling;
			System.out.println("loss of " + loss);
		}
	}
}

	
