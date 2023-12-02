package practiceFifteen;

public class PracticeRegularExpression {
	private String name;
	public boolean isValidPlayerName(String name) {
	//Conditions
	//First char is capital letters�i�p�啶���j
	//Must be eight characters(capital letters or numbers)
	//Don't leave spaces
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
	//j.va�@�񕶎��ڂ͉��ł��ǂ��B����ȊO�͎w��B
	public boolean checkJava(String name) {
		return name.matches("j.va");
	}
	//A�͕K�{B�͖����Ă��ǂ����A�����瑱���Ă��ǂ��B
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
