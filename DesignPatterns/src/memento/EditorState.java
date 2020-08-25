package memento;

public class EditorState {
//	for storing current state of editor state
	private String content;

	public EditorState(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
