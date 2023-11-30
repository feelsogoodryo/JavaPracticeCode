package objectPractice;

public class SuperHero extends Hero {
	boolean flying;
	
	public SuperHero(String name, Sword sword) {
		super(name,100,sword);
	}
	public SuperHero(String name){
		//Call another constructor
		super(name,100);	
		System.out.println("SuperHero constructor start");
	}
	public void attack(Monster m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	}
	public void fly() {
		this.flying = true;
		System.out.println(this.name + " " + "flew");
	}
	public void land() {
		this.flying = false;
		System.out.println(this.name + " " + "landed");
	}
	//Override
	public void run() {
		System.out.println("Override run-class");
		System.out.println(this.name + " " + "withdrawal");
	}
}
