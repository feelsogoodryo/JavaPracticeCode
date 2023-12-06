package dokoJava2;

import java.util.Objects;

public class Hero implements Cloneable { //一章でCloneableをimplement
	//Cloneablenoの様なinterfaceをmarker interfaceと呼ぶ
	String name;
	int hp;
	Sword sword;
	
	//Object classのclone()はprotectedな為、publicでオーバーライドすること。親クラスよりゆるいアクセス装飾にすることは可能である。
	public Hero clone() {
		Hero result = new Hero();
		result.name = this.name;
		result.hp = this.hp;
		result.sword = this.sword;
		return result;
	  }

	public Hero() {
		this.name = "";
	}
	public Hero(String name) {
		this.name = name;
	}
	public Sword getSword() {
		return this.sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
	  if (o == this) return true;
	  if (o == null) return false;
	  if (!(o instanceof Hero)) return false;
	    Hero h = (Hero) o;
	    if (!this.name.trim().equals(h.name.trim())) {
	      return false;
	    }
	    return true;
	  }
	  public int hashCode() {
		    return Objects.hash(this.name, this.hp);
	  }
	  
}
