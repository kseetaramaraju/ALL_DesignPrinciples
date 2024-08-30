package dependency_inversion;

public class Bulb implements SwitchableDevice {

	@Override
	public void turnON() {
		System.out.println(" turn on bulb ");
	}

	@Override
	public void turnOFF() {
		System.out.println(" turn off bulb ");		
	}

}
