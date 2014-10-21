import java.util.ArrayList;
import java.util.Scanner;


public class largestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] words = str.split(" ");
		ArrayList<String> largetsSequnce = new ArrayList<String>();
		ArrayList<String> currentSequence = new ArrayList<String>();
		largetsSequnce.add(words[0]);
		currentSequence.add(words[0]);
		
		for (int i = 0; i < words.length; i++) {
			if (!(words[i] == words[i+1])) {
				currentSequence.clear();
			}
			currentSequence.add(words[i]);
			 if (currentSequence.size()>largetsSequnce.size()) {
				 largetsSequnce = new ArrayList<String>(currentSequence);
			}
			 
			for (String word : largetsSequnce) {
				System.out.println(word);
			}
		}

	}

}
