package StatePattern;

public class Canvas {
	private ToolType currentTool;
	public void MouseDown() {
		if(currentTool == ToolType.SELECTION)
			System.out.println("Selection icon");
		else if (currentTool == ToolType.BRUSH)
			System.out.println("Brush Icon");
		else if(currentTool == ToolType.ERASER)
			System.out.println("Eraser Icon");
	}
	public void MouseUp() {
		if(currentTool == ToolType.SELECTION)
			System.out.println("Draw Dashed Rectangle");
		else if (currentTool == ToolType.BRUSH)
			System.out.println("Draw a line");
		else if(currentTool == ToolType.ERASER)
			System.out.println("Erase something");
	}
	public ToolType getCurrentTool() {
		return currentTool;
	}
	public void setCurrentTool(ToolType currentTool) {
		this.currentTool = currentTool;
	}
}
