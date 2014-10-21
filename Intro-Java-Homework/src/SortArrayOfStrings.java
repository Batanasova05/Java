import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] str = new String[n];
		for (int i = 0; i <= n; i++) {
			str[i] =scn.next();
		}
		Arrays.sort(str);
		for (int i = 0; i <=n; i++) {
			System.out.println(str[i]);
		}

	}

}
