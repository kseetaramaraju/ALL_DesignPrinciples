package dependency_inversion;

public class Mainclass {
	public static void main(String[] args) {

		SwitchableDevice sw=new Bulb();

		Switch s=new Switch(sw);
		s.pressOn();
		s.pressOff();

	}
}
