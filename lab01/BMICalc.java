public class BMICalc {
	public static void main (String args[]) {
		float weight = Float.parseFloat(args[0]);
		float height = ((Float.parseFloat(args[1]))/100);
		float bmi = ((weight/height)/height);
		System.out.println("Your weight is: "+weight+"\nYour height is: "+height+"\nYour BMI is: "+bmi);

		if (bmi < 18.5) {
			System.out.println("You are underweight");
		} else if (bmi < 24.9 && bmi > 18.5) {
			System.out.println("You are normal");
		} else if (bmi < 29.9 && bmi > 24.9) {
			System.out.println("You are obese");
		} else {
			System.out.println("You are morbidly obese");
		}
	}
}
