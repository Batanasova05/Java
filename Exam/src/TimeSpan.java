
import java.util.Scanner;


public class TimeSpan {

	public static void main(String[] args){
		
		

		Scanner in = new Scanner(System.in);
		
		
		
		String firstTime = in.nextLine();
		String[] start =firstTime.split(":");
		String secondTime = in.nextLine();
		String[] end = secondTime.split(":");
		int startHour = Integer.parseInt(start[0]);
		int startMinute = Integer.parseInt(start[1]);
		int starSeconds = Integer.parseInt(start[2]);
		int endHour = Integer.parseInt(end[0]);
		int endMinute = Integer.parseInt(end[1]);
		int endSeconds = Integer.parseInt(end[2]);
		int diffHours = startHour - endHour;
		int diffMinutes = startMinute - endMinute;
		int diffSecond = starSeconds - endSeconds;
		
		if (diffMinutes<0) {
			diffMinutes = 60 + diffMinutes;
			diffHours = diffHours -1;
			
		}
		
		if (diffSecond<0) {
			diffSecond = 60 + diffSecond;
			diffMinutes = diffMinutes -1;
		}
		
		
		diffHours += diffMinutes/60;
		diffMinutes = diffMinutes%60;
		diffSecond = diffSecond%60;
		if (diffMinutes>9) {
			System.out.println(diffHours + ":" + diffMinutes + ":" + diffSecond);
		}
		
		else {
			System.out.println(diffHours + ":0" + diffMinutes + ":0" + diffSecond);
		}
		
		
			
		
	
		
		
		
	    
		
		

	}

}
