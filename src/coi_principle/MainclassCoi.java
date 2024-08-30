package coi_principle;

public class MainclassCoi {
	public static void main(String[] args) {

		Enginecoi e=new Enginecoi();

		Carcoi c=new Carcoi(e);
		c.drive();

	}
}
