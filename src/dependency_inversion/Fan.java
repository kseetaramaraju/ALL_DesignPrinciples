package dependency_inversion;

public class Fan implements SwitchableDevice{

	@Override
	public void turnON() {
		System.out.println(" turn on fan ");		
	}
	
	@Override
	public void turnOFF() {
		System.out.println(" turn off fan ");
	}

}
