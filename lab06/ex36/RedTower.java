
public class RedTower extends Tower {
	public RedTower(){
		super();
		this.name = "Red Tower";
	}

	public int attackJelly() {
		System.out.println(this.name+" attacks Jelly for 2 points damage.");
		return 2;
	}
}
