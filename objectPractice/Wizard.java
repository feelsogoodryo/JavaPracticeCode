package objectPractice;

public class Wizard extends Character{
	String name;
	public int hp;
	public int mp;
	
	public Wizard(String name) {
		this.name = name;
		this.hp = 100;
		this.mp = 10;
	}
	
	//Fight
	public void attack(Monster m) {
		System.out.println(this.name + " " + "attack");
		System.out.println("3 points of damage to the enemy");
		m.hp -= 3;
	}
	public void fireball(Monster m) {
		System.out.println(this.name + " " + "threw a fireball");
		System.out.println("20 points of damage to the enemy");
		m.hp =- 20;
		this.mp -= 5; 
	}
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + " " + "recovered 10 point");
	}
}
