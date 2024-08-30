package open_closed;

public class DebitCard implements Payment{

	@Override
	public void pay() {
		System.out.println(" payment is done usind debitcard ");		
	}

}
