import java.util.Scanner;


public class DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String hex = Integer.toHexString(num);
		System.out.println(hex);
	}

}
