package javaPractice;

public class PracticeMethodChain {
	String name;
	int age;
	
	//���\�b�h�`�F�[�����������ꍇ�͖߂�l�������̃N���X�ɂ���B
	public PracticeMethodChain setName(String name){
		this.name = name;
		return this;//�����̃N���X��Ԃ��ۂ̕\�L
	}
	public PracticeMethodChain setAge(int age) {
		this.age = age;
		return this;
	}
	void show() {
		System.out.println("My name is " +this.name + "and" + "my age is " + this.age);
	}
}
