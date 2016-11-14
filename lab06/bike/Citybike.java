public class Citybike extends Bicycle {
    boolean lightsOn; // one extra attribute

    public Citybike(String t, int g, boolean lights) {
	super(t,g); // invoke the Bicycle constructor
	lightsOn=lights;
    }

    // some added functionality
    public void toggleLights() {
	lightsOn=!lightsOn;
    }

    public String toString() {
	String msg;
	// super.toString is the .toString method of Bicycle
	msg=super.toString() +"; lights are ";
	if (lightsOn) 
	    msg+="on";
	else
	    msg+="off";
	return msg;
    }

}
