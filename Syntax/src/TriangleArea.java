import java.util.Scanner;


public class TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ax = in.nextInt();
		int bx = in.nextInt();
		int cx = in.nextInt();
		int ay = in.nextInt();
		int by = in.nextInt();
		int cy = in.nextInt();
		 double b = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
         double a = Math.sqrt(Math.pow(bx-ax,2) + Math.pow(by-ay,2));
         double c = Math.sqrt(Math.pow(ax - cx, 2) + Math.pow(ay - cy, 2));
         double p = (a + b + c) / 2;
         double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));


         if (a+b>c && b+c>a && a+c>b)
         {
             
             System.out.println(Math.round((area)));
         }
         else
         {
             System.out.println(0);
             
         }

	}

}
