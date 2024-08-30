package interface_segregation;

public class ElectricHondaCar implements Car,ElectricCar{

	@Override
	public void price() {
		System.out.println(" price electric car  ");		
	}

	@Override
	public void colour() {
		System.out.println(" colour electric Car ");
	}

	@Override
	public void battery() {
		System.out.println( " battery in electric honda car ");
	}


}
