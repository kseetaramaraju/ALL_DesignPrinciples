package open_closed;

public class CreditCard implements Payment{

	@Override
	public void pay() {
		System.out.println(" payment is done usind credit card ");		
	}

}
