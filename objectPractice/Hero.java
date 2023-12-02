package objectPractice;

public class Hero extends Character {
	public String name;
	public int hp;
	public int maxHp;
	public Sword sword;
	public int gold;
	final String MYJOB = "Hero";
	
	
	public Hero(String name, int hp, Sword sword) {
		this.name = name;
		this.hp = hp;
		this.sword = sword;
		System.out.println("constructor start3");
	}
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		this.setGold(1000);
		System.out.println("constructor start2");
	}
	public Hero(String name){
		//Call another constructor
		this(name,100);
		System.out.println("constructor start1");
	}
	public String getName() {
		return this.name;
	}
	public int getGold() {
		return this.gold;
	}
	public void setGold(int gold) {
		if(gold > 0) {
			this.gold = gold;	
		}
	}
	public String getJob() {
		return this.MYJOB;
	}
	// Check status
	public void status() {
		System.out.println("Name" + " " + this.name);
		System.out.println("Hp" + " " + this.hp);
		if(sword != null) {
			System.out.println("Weapon" + " " + this.sword.name);	
		}
	}
	//Fight
	public void attack(Monster m) {
		System.out.println(this.name + " " + "attacked with a"+ " " + sword.name);
		System.out.println("5 points of damage to the enemy");
	}
	//Escape
	public void run() {
		System.out.println(this.name + " " + "escape");
	}
	
	private void die() {
		System.out.println(this.name + "ÇÕéÄÇÒÇ≈ÇµÇ‹Ç¡ÇΩÅI");
		System.out.println("GAME OVERÇ≈Ç∑ÅB");
	}
    public String toString() {
    	this.status();
        return "end";
    }
	
	//Overraide for Equals method
    public boolean equals(Object obj) {
        if (this == obj) {
        	return true;
        }
        if(obj instanceof Hero) {
        	Hero h = (Hero)obj;
        	if(this.name.equals(h.name)) {
        		return true;
        	}
        }
        return false;
    }
}
