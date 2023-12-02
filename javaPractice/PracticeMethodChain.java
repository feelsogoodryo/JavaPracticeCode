package javaPractice;

public class PracticeMethodChain {
	String name;
	int age;
	
	//メソッドチェーンをしたい場合は戻り値を自分のクラスにする。
	public PracticeMethodChain setName(String name){
		this.name = name;
		return this;//自分のクラスを返す際の表記
	}
	public PracticeMethodChain setAge(int age) {
		this.age = age;
		return this;
	}
	void show() {
		System.out.println("My name is " +this.name + "and" + "my age is " + this.age);
	}
}
