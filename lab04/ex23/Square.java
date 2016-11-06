public class Square {

	static int side; //the length of a side

	public static int area() {
		return side * side;
	}
	
	//constructor
	public Square(int a) {
		side = a;
	}

	public static void main (String[] args) {
		Square five = new Square(5);
		System.out.println("The area of the first square is: "+five.area());
	
		Square twentyNine = new Square(29);
		System.out.println("The area of the second square is: "+twentyNine.area());
	}
}
