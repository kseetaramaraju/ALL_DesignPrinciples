package kiss_principle;

public class CalculatorGood {

	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	public static void main(String[] args) {

		CalculatorGood c=new CalculatorGood();
		System.out.println(c.add(10,20));
		System.out.println(c.sub(20,10));
		System.out.println(c.mul(10,20));
		System.out.println(c.div(20,2));


	}

}
