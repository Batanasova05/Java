import java.util.Scanner;


public class phytagorianNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] intArray = new int[n];
		boolean noAnswer = false;
		
		for (int i = 0; i < intArray.length; i++) {
			int number = input.nextInt();
			intArray[i] = number;
			
		}
		for (int i = 0; i < intArray.length; i++) {
			int a = intArray[i];
			for (int j = 0; j < intArray.length; j++) {
				int b = intArray[j];
				if (a<=b) {
				for (int k = 0; k < intArray.length; k++) {
				int c = intArray[k];
				if (a*a + b*b == c*c) {
					System.out.printf("%1$d*%1$d + %2$d*%2$d = %3$d*%3$d", a, b, c);
					System.out.println();
					noAnswer = true;
					
				}	
				}
			
				
			}
			}
			
			
		}
		if (noAnswer!= true) {
			System.out.println("No");
		}
		}
	

		}

	


