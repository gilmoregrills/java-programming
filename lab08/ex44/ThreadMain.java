public class ThreadMain {
	public static void main(String[] args) {
		FirstTask ft1 = new FirstTask("Thread A", 50); 
		FirstTask ft2 = new FirstTask("Thread B", 50);
		SecondTask st1 = new SecondTask(50);

		Thread t1 = new Thread(ft1);
		Thread t2 = new Thread(ft2);
		Thread t3 = new Thread(st1);

		t1.start();
		t2.start();
		t3.start();

	}
}
