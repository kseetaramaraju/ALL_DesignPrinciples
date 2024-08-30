package single_resposibility;

// good implmentation for single responsibility
public class Employee {

	private int eid;
	private String eName;

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}


}

class EmployeeService
{
	// bussiness logic 
	public void saveEmployee()
	{
		System.out.println(" save Employee ");	
	}
	public void modifyEmployee()
	{
		System.out.println(" modify Employee ");	
	}
}

class EmployeeRepository
{
	// persistence logic 
	public void saveEmployeeById(int id)
	{
		System.out.println(" save Employee ");	
	}
	public void modifyEmployeeById(int id)
	{
		System.out.println(" modify Employee ");	
	}
}





