import java.util.Scanner;


public class videoDuration {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int hours= 0;
		int mins = 0;
		
		
		
		while (true) {
			String inputs = input.nextLine();
			if (inputs.equals("End")) {
				break;
				
			}
			String[] str = inputs.split(":");
			hours += Integer.parseInt(str[0]);
			mins += Integer.parseInt(str[1]);
			
		
		}
	hours += mins/60;
	mins = mins%60;
	if (mins>9) {
		System.out.println(hours + ":" + mins);
	}
	
	else {
		System.out.println(hours + ":0" + mins);
	}
	}
	
	

}
