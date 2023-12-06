package dokoJava2;

import java.util.Objects;

public class Hero implements Cloneable { //��͂�Cloneable��implement
	//Cloneableno�̗l��interface��marker interface�ƌĂ�
	String name;
	int hp;
	Sword sword;
	
	//Object class��clone()��protected�ȈׁApublic�ŃI�[�o�[���C�h���邱�ƁB�e�N���X����邢�A�N�Z�X�����ɂ��邱�Ƃ͉\�ł���B
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
