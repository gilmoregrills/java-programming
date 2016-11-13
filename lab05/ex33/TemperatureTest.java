import java.util.Random;

public class TemperatureTest {
	public static void main(String[] args) {

		//initialise the week object
		WeeklyTemperatures week = new WeeklyTemperatures();
		//initialise the random generator to fill our arrays
		Random rando = new Random(70);
		//create the day objects and store them in the week
		DayTemperatures mon = new DayTemperatures();
		week.setDay(0, mon);
		DayTemperatures tue = new DayTemperatures();
		week.setDay(1, tue);
		DayTemperatures wed = new DayTemperatures();
		week.setDay(2, wed);
		DayTemperatures thu = new DayTemperatures();
		week.setDay(3, thu);
		DayTemperatures fri = new DayTemperatures();
		week.setDay(4, fri);
		DayTemperatures sat = new DayTemperatures();
		week.setDay(5, sat);
		DayTemperatures sun = new DayTemperatures();
		week.setDay(6, sun);
		//checks how many days are stored in the week, and how many hours are in each day
		for (DayTemperatures d : WeeklyTemperatures.week) {
			System.out.println(d);
			System.out.println(d.temps.length);
		}

		//supposed to generate random doubles to fill out temp readings for a single day
		for (DayTemperatures d : WeeklyTemperatures.week) {
			for (int i = 0; i <= 23; i++) {
				double temp = rando.nextDouble();
				d.setTemperature(i, temp);
			}
			System.out.println("The average temp for this random day is: "+d.meanTemperature()); 
		}

	}
}
				
