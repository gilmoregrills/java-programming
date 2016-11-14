public class Bicycle {
    String colour; // default visibility
    int gears;
    int odo;

    // constructor
    public Bicycle(String t, int g) {
	colour=t;
	gears=g;
	odo=0;
    }

    public void pedal(int miles) {
	odo+=miles;
    }

    // called by println when we attempt to print the object
    public String toString() {
	return "A "+ colour+ " bike with " + gears + 
	    " gears and " + odo + " miles on the clock";
    }
}
