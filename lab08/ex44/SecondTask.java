public class SecondTask
	implements Runnable {

	private int countFrom;

	public SecondTask(int input) {
		countFrom = input;
	}
	
	public void run() { 
		for (int i = countFrom; i >= 0; i--) {
			System.out.print(i);
		}
	}
}
