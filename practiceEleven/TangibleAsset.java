package practiceEleven;

public abstract class TangibleAsset extends Asset implements Thing {
	  String color;
	  double weight;
	  // �R���X�g���N�^
	  public TangibleAsset(String name, int price, String color) {
		super(name, price);
	    this.color = color;
	  }
	  // ���\�b�h
	  public String getColor() {
		  return this.color; 
	  }
	  public void setWeight(double weight) {
		  this.weight = weight; 
	  }
}
