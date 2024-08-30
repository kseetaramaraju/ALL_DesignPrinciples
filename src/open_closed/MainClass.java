package open_closed;

public class MainClass {
	public static void main(String[] args) {


		Payment p=new CreditCard();
		p.pay();

		Payment p1=new DebitCard();
		p1.pay();

		Payment p2=new UPIPayment();
		p2.pay();


	}
}
