package practiceFifteen;

public class PracticeRegularExpression {
	private String name;
	public boolean isValidPlayerName(String name) {
	//Conditions
	//First char is capital letters（英大文字）
	//Must be eight characters(capital letters or numbers)
	//Don't leave spaces
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	//j.va　二文字目は何でも良い。それ以外は指定。
	public boolean checkJava(String name) {
		return name.matches("j.va");
	}
	//Aは必須Bは無くても良いし、いくら続いても良い。
	public boolean checkAB(String name) {
		return name.matches("AB*");
	}
	
	public void setName(String name) {
		if(this.isValidPlayerName(name)) {
			this.name = name;
			System.out.println(this.name);
		}
	}
	public void setJava(String name) {
		if(this.checkJava(name)) {
			this.name = name;
			System.out.println(this.name);
		}
	}
	public void setAB(String name) {
		if(this.checkAB(name)) {
			this.name = name;
			System.out.println(this.name);
		}
	}
}
