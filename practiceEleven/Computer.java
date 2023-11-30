package practiceEleven;

public class Computer extends TangibleAsset{
	  String makerName;
	  // コンストラクタ
	  public Computer(String name, int price, String color, String makerName) {
	  super(name, price, color);
	  this.makerName = makerName;
	  }
	  // メソッド
	  public String getMakerName() {
		  return this.makerName; 
	  }
	  
	  public double getWeight() {
		  return this.weight; 
	  }
	  public void setWeight(double weight) {
		  this.weight = weight; 
	  }
	}
