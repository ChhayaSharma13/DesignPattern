package adapter;

public class Assignment implements Pen{
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
	@Override
	public void write(String str) {
		// TODO Auto-generated method stub
		
	}
}
