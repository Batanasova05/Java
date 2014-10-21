import java.util.Scanner;


public class CountBeers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		int beers = 0;
		int stacks = 0;
		String[] temp;
		
		while (!input.equals("End")) {
			 temp = input.split(" ");
			if (temp[1].equals("stacks")) {
				stacks += Integer.parseInt(temp[0]);
			}else 
				beers += Integer.parseInt(temp[0]);
				input= in.nextLine();		
				
				
			
		}
			if (beers>=20) {
				stacks += beers/20;
				beers%=20;
		}
		System.out.println(stacks + " stacks + "  + beers + " beers");
	}
}


