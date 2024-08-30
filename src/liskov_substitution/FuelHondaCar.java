package liskov_substitution;

public class FuelHondaCar implements Car{

	@Override
	public void price() {
		System.out.println(" price FuelHondaCar ");
	}

	@Override
	public void colour() {
		System.out.println(" colour FuelHondaCar ");		
	}

	//	@Override
	//	public void fuel() {
	//		System.out.println(" fuel FuelHondaCar ");
	//	}

}
