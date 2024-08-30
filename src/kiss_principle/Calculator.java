package kiss_principle;

public class Calculator {

	public int calculate(int a,int b,String type)
	{
		if(type.equalsIgnoreCase("add"))
		{
			return a+b;
		}
		else if(type.equalsIgnoreCase("substract"))
		{
			return Math.abs(a-b);
		}
		else if(type.equalsIgnoreCase("multiply"))
		{
			return a*b;
		}
		else if(type.equalsIgnoreCase("division"))
		{
			return a/b;
		}
		else 
		{
			return -1;
		}
	}

	public static void main(String[] args) {

		Calculator c=new Calculator();
		System.out.println(c.calculate(10,20,"add"));

		// in this example in sigle method we are doing the all 
		// operations that should not be done, if we do it the complexity of 
		// the program will increase,to reduce that we have to create separate 
		// methods for each operation 
		// then the code will be more flexible,maintainable,understandable etc..


	}

}
