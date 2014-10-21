import java.util.Scanner;


public class Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String letter = input.nextLine();
		
		String threeLetterWord = "";
		for (int i = 0; i < letter.length(); i++) {
			for (int j = 0; j < letter.length(); j++) {
				for (int k = 0; k < letter.length(); k++) {
					threeLetterWord = "" + letter.charAt(i) + letter.charAt(k) + letter.charAt(j);
					System.out.print(threeLetterWord + " ");
				}
			}
		}
		
	}

}
