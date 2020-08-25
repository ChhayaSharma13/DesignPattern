package memento;

public class Editor {
	//For storing current content of editor
	private String content;

	public String getContent() {
		return content;
	}
	public EditorState createState() {
		return new EditorState(content);
	}
	public void restore(EditorState state) {
		content = state.getContent();
	}
	public void setContent(String content) {
		this.content = content;
	}

	
	
}
