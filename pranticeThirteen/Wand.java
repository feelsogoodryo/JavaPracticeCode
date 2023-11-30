package pranticeThirteen;

public class Wand {
	private String name;     // èÒÇÃñºëO
	private double power;    // èÒÇÃñÇóÕ
	
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if(power < 0.5 || power > 100) {
			throw new IllegalArgumentException("Specifications do not match");
		}
		this.power = power;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name.length() < 3) {
		    throw new IllegalArgumentException("Name is incorrect");
		}
		this.name = name;
	}
}
