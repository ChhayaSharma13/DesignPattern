package StatePattern;

public interface Tool {
//	interface shows capability that a class should provide
	//both abstract class and interface are abstract object
	//abstract class - when we need to provide some common code to child classes
	// no need to use public  and abstract as they are by default public and abstract
	 void mouseDown();
	 void mouseUp();
}
