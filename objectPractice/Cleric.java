package objectPractice;

public class Cleric {
	String name = "cleriy";
	int hp = 50;	
	final int maxHp = 50;
	int mp = 10;
	final int maxMp = 10;
	
	public void selfAid() {
		this.mp -= 5;
		this.hp = this.maxHp;
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "prayed to heaven for" + sec + "secpmds");
		int recovery =new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.maxMp - this.mp, recovery);
		this.mp = recoverActual;
		System.out.println("MP recovered" + recoverActual);
		return recoverActual;
	}
}
