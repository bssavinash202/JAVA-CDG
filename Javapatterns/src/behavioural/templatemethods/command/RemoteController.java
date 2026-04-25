package behavioural.templatemethods.command;

//Invoker class
public class RemoteController {

	private Command command;
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void pressButton() {
		command.execute();
	}
	
}
