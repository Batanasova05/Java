import java.util.Scanner;


public class DozenEggs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int eggs =0;
		
		
		
		for (int i = 0; i < 7; i++) {
			String input = in.nextLine();
			String[] splitWords = input.split(" ");
			if (splitWords[1].equals("eggs")) {
				eggs += Integer.parseInt(splitWords[0]);
			}else
				eggs += Integer.parseInt(splitWords[0]) *12;
				
		}
		
		System.out.printf("%d dozens + %d eggs", eggs/12, eggs%12);
	}

}
