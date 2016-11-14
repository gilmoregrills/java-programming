import java.util.ArrayList;

public class TestBicycle {


    public static void main(String[] args)
    {
	Bicycle mybike=new Bicycle("yellow", 9);
	Citybike yourbike=new Citybike("pink", 3, false);
	ArrayList<Bicycle> allbikes =new ArrayList<Bicycle>();

       
	mybike.pedal(5);
	// added functionality in the subclass
	yourbike.toggleLights();
	// inherited functionality
	yourbike.pedal(10);

	// an arraylist of the superclass type can store both...
	allbikes.add(mybike);
	// ... because a citybike is-a bicycle
	allbikes.add(yourbike);

	for (int i=0; i<allbikes.size(); ++i)
	    // polymorphic call to .toString()
	    System.out.println(allbikes.get(i));
    }
}
