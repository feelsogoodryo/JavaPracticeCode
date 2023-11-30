package pranticeThirteen;

public class Wizard {
	private String name;
	private int hp;
	private int mp;
	private Wand wand;
	
	public Wizard(String name,int hp, int mp, Wand wand) {
		this.setName(name);
		this.setHp(hp);
		this.setMp(mp);
		this.setWand(wand);
	}
	public Wizard() {
		
	}
	
	public void getStatus() {
		System.out.println(this.name + " " + "status");
		System.out.println("Name:" + this.name);
		System.out.println("Hp:" + this.hp);
		System.out.println("Mp:" + this.mp);
		System.out.println("Wand:" + this.wand.getName());
	}
	
	void heal(Hero h) {
		int basePoint = 10;                                   // 基本回復ポイント
	    int recovPoint = (int)(basePoint * this.wand.getPower());  // 杖による増幅
	    h.setHp(h.getHp() + recovPoint);                      // 勇者のHPを回復する
	    System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	public int getHp() { return this.hp; }
	public void setHp(int hp) {	
		if(hp < 0) {
			this.hp = 0;
	  } else {
		this.hp = hp;
	  } 
	}
	public int getMp() { return this.mp; }
	public void setMp(int mp) {	
		if(mp < 0) {
			throw new IllegalArgumentException("Mp is incorrect");
		}
		this.mp = mp; 
	}
	public String getName() { return this.name; }
	public void setName(String name) { 
		if(name.length() < 3) {	
		    throw new IllegalArgumentException("Name is incorrect");
		}
		this.name = name; 
	}
	public Wand getWand() { return this.wand; }
	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("wand is null");
		}
		this.wand = wand;
	}
}