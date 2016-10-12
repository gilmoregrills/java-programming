public class MyCircle {
	public static void main (String[] args) {
		double radius = Double.parseDouble(args[0]);
		double PI = 3.1415926;
		double circumference = (2*radius*PI);
	        double area = (4*radius*PI);	
		System.out.println("The radius of the circle is "+radius+".\nIts circumference is "+circumference+".\nAnd its area is "+area+".");
	}
}
