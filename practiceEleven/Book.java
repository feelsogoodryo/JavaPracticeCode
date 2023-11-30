package practiceEleven;

public class Book extends TangibleAsset {
	  String isbn;
	  // コンストラクタ
	  public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
	    this.isbn = isbn;
	  }
	  // メソッド
	  public String getIsbn() { 
		  return this.isbn; 
	  }
	  public double getWeight() {
		  return this.weight; 
	  }
	  public void setWeight(double weight) {
		  this.weight = weight; 
	  }
	}