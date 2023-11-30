package objectPractice;

public abstract class Character {	
	public String name;
	public int hp;
	public void run() {
		System.out.println(this.name + " " + "escape");
	}
	//I must make this method.
	public abstract void attack(Monster m);
}
