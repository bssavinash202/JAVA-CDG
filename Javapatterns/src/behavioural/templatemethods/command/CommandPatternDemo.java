package behavioural.templatemethods.command;

public class CommandPatternDemo {
	
	public static void main(String[] args) {
		Light drawingRoomLight = new Light();
		
		Command lightOn = new LightOnCommand(drawingRoomLight);
		
		Command lightOff = new LightOffCommand(drawingRoomLight);
		
		RemoteController remote = new RemoteController();
		remote.setCommand(lightOff);
		remote.pressButton();
		
		
		remote.setCommand(lightOn);
		remote.pressButton();
	}
}
