package interface_segregation;

public class Mainclass {
	public static void main(String[] args) {

		// in below only common methods present in Car,those methods only accessed
		Car c=new FuelHondaCar();
		c.colour();
		c.price();

		Car c1=new ElectricHondaCar();
		c1.colour();
		c1.price();


		FuelCar f=new FuelHondaCar();
		f.fuel();

		ElectricCar e=new ElectricHondaCar();
		e.battery();

		// here the new methods are added without effecting the correctness of the program


	}
}
