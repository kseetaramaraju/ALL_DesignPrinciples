package dependency_inversion;

public class Switch {

	private SwitchableDevice device;
	public boolean on_or_off;

	public Switch(SwitchableDevice device) {
		super();
		this.device = device;
	}

	public void pressOn()
	{
		device.turnON();
	}
	public void pressOff()
	{
		device.turnOFF();
	}


}
