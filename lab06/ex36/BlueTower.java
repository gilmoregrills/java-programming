
public class BlueTower extends Tower {
	public BlueTower(){
		super();
		this.name = "Blue Tower";
	}

	public int attackJelly() {
		System.out.println(this.name+" attacks Jelly for 2 points damage.");
		return 2;
	}
}
