package objectPractice;

public class Dancer extends Character {
	public void dance() {
		System.out.println(this.name + "" + "dancing");
	}
	public void attack(Monster m) {
		System.out.println(this.name +" " + "attack");
		System.out.println("3 points of damage to the enemy");
		m.hp -= 3;
	}
}
