package adapter;

public class PenAdapter implements Pen {
	PilotPen pp = new PilotPen();
//	Will create Pilot Pen object
	@Override
	public void write(String str) {
		
	pp.mark(str);	
	}

}
