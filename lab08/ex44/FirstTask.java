public class FirstTask
	implements Runnable {

	private String printMe;
	private int times;

	public FirstTask(String output, int t) {
		printMe = output;
		times = t;
	}

	public void run() {
		for (int i = 0; i <= times; i++) {
			System.out.print(printMe);
		}
	}
}
