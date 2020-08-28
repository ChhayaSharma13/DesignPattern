package FactoryExample;

public class FactoryMain {
	public static void main(String[] args) {
		/*
		 * Room t = new TwinRoom(); t.facility();
		 */
		RoomFactory rf = new RoomFactory();
		Room r = rf.getInstance(1); 
		r.facility();
		
	}
}