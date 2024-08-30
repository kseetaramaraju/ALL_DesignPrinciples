package open_closed;

//  open/closed principle states that 
//  the code always should be open for extension and closed for modification
//  below code is ready for modification because in future any new payment type is came then 
//  the below code should modify
//  vailating the open/closed principle
public class PaymentBad {

	public void pay(String type)
	{
		if(type.equals("creditcard"))
		{
			System.out.println(" pay using credit card ");
		}
		else if(type.equals("debitcard"))
		{
			System.out.println(" pay using debit card");
		}
		else 
		{
			System.out.println(" invalid type ");
		}
	}


}
