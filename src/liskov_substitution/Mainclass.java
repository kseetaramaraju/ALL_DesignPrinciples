package liskov_substitution;

public class Mainclass {
	public static void main(String[] args) {

		Car c=new FuelHondaCar();
		c.colour();
		//c.fuel();
		c.price();

		Car c1=new ElectricCar();
		c1.colour();
		//c1.fuel();
		c1.price();
		// c1.battery(); can not be acessed 


		// in liskov substitution the electric car do not implement 
		// the fuel method , forcefully by the super class, if implemented also it is not correct 
		// so that when we substitute the sub classess object with the super class object 
		// the correct ness of the program is not damaged\
		// so that we have to remove uncommon method from both the clasess that are 
		// fuel() and battery() from the respective subclasess and from super clasess 
		// to add extra methods next principle is used that is Interface segregation 

	}
}
