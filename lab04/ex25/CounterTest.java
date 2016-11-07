public class CounterTest {
	public static void main (String[] args) {
		Counter testCounter = new Counter();
		testCounter.setCount(2);
		testCounter.setMax(15);	
		System.out.println(testCounter.toString());
		for (int i = 0; i <= 15; i++) {
			testCounter.increase();
			System.out.println("Count incremented by one: "+testCounter.getCount());
		}
		testCounter.setCount(14);
		System.out.println("Count has been set to: "+testCounter.getCount());
		for (int j = 0; j <= 15; j++) {
			testCounter.decrease();	
			System.out.println("Count decremented by one: "+testCounter.getCount());
		}
		testCounter.reset();
		System.out.println("The count has been reset and is now: "+testCounter.getCount());
		for (int k = 0; k <= 4; k++) {
			testCounter.increase(6);
			System.out.println("Count incremented by 6: "+testCounter.getCount());
		}
		System.out.println("Counter is now at: "+testCounter.getCount()+" Setting count to 10");
		testCounter.setCount(10);
		for (int l = 0; l <= 2; l++) {
			testCounter.decrease(6);
			System.out.println("Count decremented by 6: "+testCounter.getCount());
		}
	}
}
