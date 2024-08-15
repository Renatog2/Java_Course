package entites;

public class product {
	public String name;
	public double test1;
	public double test2;
	public double test3;
	
	public double note() {
		return test1 + test2 + test3;
	}

	public String required() {
		return "MISSING " + String.format("%.2f", (60.0 - (test1 + test2 + test3)));
	}
	
	public String status() {
		if(note() > 60.0) {
			return "PASS";
		}else {
			return "FAILED\n" + required() + " POINTS";
		}
	}
}
