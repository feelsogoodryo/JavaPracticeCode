package objectPractice;

public class PoisonMatango extends Matango{
	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if(poisonCount != 0) {
			System.out.println("PoisonMatango also spread poisonous spores");
			int damage = h.hp / 5;
			h.hp -= damage;
			System.out.println(damage + " " + "point damage");
			poisonCount --;
		}
	}
	 public void run() {
		 System.out.println("PoisonMatango" +" "+ this.suffix + " " + "escape");
	 }
}
