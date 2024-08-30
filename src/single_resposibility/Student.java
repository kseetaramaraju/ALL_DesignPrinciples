package single_resposibility;

public class Student {


	// bad implementation 
	// here the bussiness logic and persistence logic are also present 
	// in the same class , as single resposibility states that each class 
	// should have single responsible.
	// the below class as multiple responsibilities so that it is bad implementation 
	// vailating the single responsibility principle

	// variables 
	private int sid;
	private String sName;


	// getters and setters


	// bussiness logic 
	public void saveStudent()
	{
		System.out.println(" save student ");	
	}
	public void modifyStudent()
	{
		System.out.println(" modify student ");	
	}

	// repo or database or persistence layer
	public void getStudentById(int id)
	{
		System.out.println(" getting  student based on id from the database ");	
	}
	public void modifyStudentById()
	{
		System.out.println(" modifying student based on id from the database ");	
	}



}
