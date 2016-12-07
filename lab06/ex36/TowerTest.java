import java.util.ArrayList;

public class TowerTest {
	public static void main (String[] args){
		ArrayList<Tower> towerList = new ArrayList<Tower>();
		BlueRedTower blueRedTower1 = new BlueRedTower();
		towerList.add(blueRedTower1);
		BlueTower blueTower1 = new BlueTower();
		blueTower1.increaseLevel();
		towerList.add(blueTower1);
		BlueTower blueTower2 = new BlueTower();
		blueTower2.increaseLevel(); 
		blueTower2.increaseLevel();
		blueTower2.increaseLevel();
		towerList.add(blueTower2);
		RedTower redTower1 = new RedTower();
		towerList.add(redTower1);
	//	System.out.println("Blue Red Tower attacks Jelly for "+blueRedTower1.attackJelly()+" point damage.");	
	//		System.out.println("Blue Tower attacks Jelly for "+blueTower1.attackJelly()+" points damage.");
	//	System.out.println("Blue Tower attacks Jelly for "+blueTower2.attackJelly()+" point damage.");
	//	System.out.println("Red Tower attacks Jelly for "+redTower1.attackJelly()+" point damage.");
		for (Tower t: towerList) System.out.println(t);
		for (Tower t: towerList) t.attackJelly();

	}
}
