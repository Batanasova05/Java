import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class CognateWords {

	public static void main(String[] args) {
		int counter =0;
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		 String[] words = input.split("[^a-zA-Z]+");
         HashSet<String> matches = new HashSet<>();
         
		 
		 for (int a = 0; a < words.length; a++) {
			 String wordA = words[a]; 
			 for (int b = 0; b < words.length; b++) {
				 String wordB = words[b];
				 for (int c = 0; c < words.length; c++) {
					 String wordC = words[c];
					
					String leftSide = wordA + wordB;
					 
					 if (a!=b && b!=c && a!=c) {
						 if (leftSide.equals(wordC)) {
							 String match = wordA+"|" +wordB+ "=" + wordC;
							 if (!matches.contains(match)) {
								matches.add(match);
							 counter++;
							}
							 														
						 }		
					}
					
				}
				
			}
			
		}
		 	for (String Integer : matches) {
				System.out.println(Integer);
			}
		 	
	}

}
