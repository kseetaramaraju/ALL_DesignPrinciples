package liskov_substitution;

public class ElectricCar implements Car{

	@Override
	public void price() {
		System.out.println(" price electric car  ");		
	}

	@Override
	public void colour() {
		System.out.println(" colour electric Car ");
	}

	//	public void battery() {
	//		System.out.println(" battery electric car ");
	//	}
	//
	//	@Override
	//	public void fuel() {
	//
	//	}

}
