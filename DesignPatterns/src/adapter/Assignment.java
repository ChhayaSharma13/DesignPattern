package adapter;

public class Assignment{
	private Pen p;
	
	public Pen getP() {
		return p;
	}
	public void setP(Pen p) {
		this.p = p;
	}
	public void writeAsssignment(String str) {
		p.write(str);
	}

}
