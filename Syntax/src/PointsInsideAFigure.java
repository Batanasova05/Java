import java.util.Scanner;


public class PointsInsideAFigure {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float num1 = in.nextFloat();
		float num2 = in.nextFloat();
		
		if ((num1>=12.5 && num1<=22.5) && (num2>=6 && num2<=8.5)) {
			System.out.println("Inside");
		}
		else if((num1>=12.5 && num1<=17.5) &&(num2>=8.5 && num2<=13.5) ) {
			System.out.println("Inside");
		}
		else if ((num1>=20 && num1<=22.5) &&(num2>=8.5 && num2<=13.5)) {
			System.out.println("Inside");
		}
		else  {
			System.out.println("outside");
		}

	}

}
