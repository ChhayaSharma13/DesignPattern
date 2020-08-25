package StatePattern;

public class Canvas {
	private Tool currentTool;
	public void MouseDown() {
		currentTool.mouseDown();
	}
	public void MouseUp() {
		currentTool.mouseUp();
	}
	public Tool getCurrentTool() {
		return currentTool;
	}
	public void setCurrentTool(Tool currentTool) {
		this.currentTool = currentTool;
	}
}
