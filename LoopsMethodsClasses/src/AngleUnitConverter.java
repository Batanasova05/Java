import java.util.Scanner;


public class AngleUnitConverter {
	
	public static double deg2rad(double d){
		return (d*Math.PI)/180;	
	}
	
	public static double rad2deg(double r){
		return (r*180)/Math.PI;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
		for (int i = 0; i < n; i++) {
			double number = in.nextDouble();
			String measure =in.next();
			
		if ("measure"=="rad") {
			System.out.printf("%.6f %s\n",rad2deg(number), measure);
		}
		if ("measure"=="deg") {
			System.out.printf("%.6f %s\n",deg2rad(number), measure);
		}
		
		}
		
	}
	
}
