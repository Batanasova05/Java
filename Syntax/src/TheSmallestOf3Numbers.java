import java.util.Scanner;


public class TheSmallestOf3Numbers {

	public static void main(String[] args){ 
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double smallest = Math.min(Math.min(a, b),c);
		System.out.println(Double.toString(smallest).replaceAll("\\.0", ""));
	}

}
