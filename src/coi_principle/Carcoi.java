package coi_principle;

public class Carcoi {

	private Enginecoi enginecoi;

	public Carcoi(Enginecoi enginecoi) {
		super();
		this.enginecoi = enginecoi;
	}

	public void drive()
	{
		enginecoi.start();
		System.out.println(" start driving the car ");
	}

}
