import java.util.ArrayList;
import java.util.Scanner;


public class sequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] ArrayOfString = str.split(" ");
		
		
		if (ArrayOfString.length==1) {
			System.out.println(ArrayOfString[0]);
		}
		for (int i = 0; i < ArrayOfString.length-1; i++) {
			if (ArrayOfString[i]== ArrayOfString[i+1]) {
				System.out.print(ArrayOfString[i] + " ");
			}
			else {
				System.out.println(ArrayOfString[i]);
			}
			
			}
		if (str.length() !=1) {
			System.out.print(ArrayOfString[ArrayOfString.length -1]);
		}
	}

}
