package behavioural.templatemethods.command;

public class LightOffCommand implements Command{
	
	private Light light;
	
	LightOffCommand(Light light){
		this.light=light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.turnOff();
	}

}
