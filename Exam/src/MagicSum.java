

import java.util.Scanner;


public class MagicSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = Integer.parseInt(in.nextLine());
		int[] numbers = new int[100];
		String input = in.nextLine();
		
		
		int currentSum =0;
		int maxSum = 0;
		
		while (!input.equals("End")) {
		for (int i = 0; i < numbers.length; i++) {
			 int numberA = numbers[i]; 
			 for (int j = 0; j < numbers.length; j++) {
				 int numberB = numbers[j];
				 for (int k = 0; k < numbers.length; k++) {
					 int numberC = numbers[k];
					 
					 if (maxSum<currentSum) {
						currentSum+= numbers[i];
						
					}
					else if (currentSum<0) {
							currentSum = 0;
						}
						maxSum ++;
					}
				}
			}
			 		
	}
		if (maxSum%d == 0) {
			System.out.println(maxSum);
		}
		
		else {
			System.out.println("No");
		}
			
		}
		
	}



