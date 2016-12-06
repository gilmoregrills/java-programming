public class JellyTest {
	public static void main(String[] args) {
		BlueJelly b1 = new BlueJelly(100, "bluey");
		BlueJelly b2 = new BlueJelly(90, "bluzo");

		RedJelly r1 = new RedJelly(80, "rod");
		RedJelly r2 = new RedJelly(70, "rude");

		System.out.println("r1's properties are: "+r1.getHealth()+" health, and its name is "+r1.getName()+" and is it alive? "+r1.isAlive()+". Oh also it is a "+r1.getColour()+" jelly.");
		System.out.println("r2's properties are: "+r2.getHealth()+" health, and its name is "+r2.getName()+" and is it alive? "+r2.isAlive()+". Oh also it is a "+r2.getColour()+" jelly.");
		System.out.println("b1's properties are: "+b1.getHealth()+" health, and its name is "+b1.getName()+" and is it alive? "+b1.isAlive()+". Oh also it is a "+b1.getColour()+" jelly.");
		System.out.println("b2's properties are: "+b2.getHealth()+" health, and its name is "+b2.getName()+" and is it alive? "+b2.isAlive()+". Oh also it is a "+b2.getColour()+" jelly.");

	}
}
