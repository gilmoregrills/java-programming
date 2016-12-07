
public class BlueRedTower extends Tower {
	
	public BlueRedTower(){
		super();
		this.name = "Blue Red Tower";
	}

	public int attackJelly() {
		System.out.println(this.name+" attacks Jelly for 1 point damage.");
		return 1;
	}
	
}
