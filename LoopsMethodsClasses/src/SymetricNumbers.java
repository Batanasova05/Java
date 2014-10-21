import java.util.Scanner;


public class SymetricNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = a; i <=b ; i++) {
			if (i<=11) {
				System.out.print(i+" ");
			}
			else if (i>11 && i<100) {
				if (i%10==i/10) {
					System.out.print(i+" ");
				}
				
			} else if (i>100) {
				if (i%10==i/100) {
					System.out.print(i+" ");
				}
			}

			
		}
		System.out.println();
	}
	

}
