package StatePattern;

public class BrushTool implements Tool{
	public void mouseDown() {
		System.out.println("Brush Icon");
	}
	
	public void mouseUp() {
		System.out.println("Draw a Line");
	}
}
