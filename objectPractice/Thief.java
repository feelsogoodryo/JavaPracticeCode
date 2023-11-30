package objectPractice;

public class Thief extends Character {
	String name;
	public int hp;
	public int mp;
	
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Thief(String name, int hp) {
		this(name,hp, 5);
	}
	
	public Thief(String name) {
		this(name, 40);
		
	}
	//Fight
	public void attack(Monster m) {
		System.out.println(this.name + " " + "attack");
		System.out.println("3 points of damage to the enemy");
		m.hp -= 3;
	}
	

}
