public class ThreadMain {
	public static void main(String[] args) {
		FirstTask ft1 = new FirstTask("Thread A ", 50); 
		FirstTask ft2 = new FirstTask("Thread B ", 50);
		SecondTask st1 = new SecondTask(50);

		Thread t1 = new Thread(ft1);
		Thread t2 = new Thread(ft2);
		Thread t3 = new Thread(st1);
//sanity checks, after anxiety caused by multiple identical outputs
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

		t1.start();
		t2.start();
		t3.start();
//again, sanity checks, may print in the middle of threads, if 
//threads have not all terminated, doesn't matter tbh
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());

	}
}
