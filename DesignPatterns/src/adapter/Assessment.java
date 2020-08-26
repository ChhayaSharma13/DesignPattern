package adapter;

public class Assessment {
	public static void main(String[] args) {
		Pen p = new PenAdapter();
		Assignment as = new Assignment();
		as.setP(p);
		as.writeAsssignment("Writing assignment is a bit boring but its important");
	}
}
