package FactoryExample;

public class RoomFactory {
	public Room getInstance(int member) {
		if(member == 1) {
			return new SingleRoom();
		}
		else{
			return new TwinRoom();
		}
		
	}
}
