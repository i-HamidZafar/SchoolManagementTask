package SourcesFilesOfProject;
import java.util.Scanner;

public class Teacher 
{
	private String Name;
	private String Birthday;
	private String Subject;
	private int ID;
	private float Salary;
	private String Address;
	private String City;
	private String Country;
	
	//Constructor with no parameters
	public Teacher()
	{
		Scanner scan= new Scanner(System.in);

		 System.out.print("\n\t\t\t\tEnter the Name: ");
		 this.Name = scan.nextLine();
		 System.out.print("\n\t\t\t\tEnter the Birthday[DD/MN/YEAR]: ");
		 this.Birthday = scan.nextLine();
		 System.out.print("\n\t\t\t\tEnter the Subject: ");
		 this.Subject= scan.nextLine();
		 System.out.print("\n\t\t\t\tEnter the ID: ");
		 String id= scan.nextLine();
		 this.ID = Integer.parseInt(id);
		 System.out.print("\n\t\t\t\tEnter the Salary: ");
		 String salary= scan.nextLine();
		 this.Salary = Float.parseFloat(salary);
		 System.out.print("\n\t\t\t\tEnter the Address: ");
		 this.Address = scan.nextLine();
		 System.out.print("\n\t\t\t\tEnter the City: ");
		 this.City = scan.nextLine();
		 System.out.print("\n\t\t\t\tEnter the Country: ");
		 this.Country = scan.nextLine(); 	
	}
	//Parameterized Constructor
	public Teacher(String Name,String Birthday ,String Subject, int ID, float Salary, String Address, String City, String Country) 
	{
		this.Name= Name;
		this.Birthday= Birthday;
		this.Subject= Subject;
		this.Salary= Salary;
		this.Address= Address;
		this.City= City;
		this.Country= Country;
		this.ID= ID;
	}
	
	//getters
	public String getName() 
	{
		return this.Name;
	}
	public String getBirthday()
	{
		return this.Birthday;
	}
	public String getSubject()
	{
		return this.Subject;
	}
	public int getID() 
	{
		return this.ID;
	}	
	public float getSalary() {
		return this.Salary;
	}
	public String getAddress()
	{
		return this.Address;
	}
	public String getCity()
	{
		return this.City;
	}
	public String getCountry()
	{
		return this.Country;
	}
	
	
	//Setters 
	private void setName (String Name) 
	{
		 this.Name = Name;
	}
	private void setBirthday (String Birthday)
	{
		this.Birthday= Birthday;
	}
	private void setSubject (String Subject)
	{
		 this.Subject= Subject;
	}
	public void setID (int ID) 
	{
		 this.ID = ID;
	}	
	private void setSalary (float salary) 
	{
		 this.Salary= Salary;
	}
	private void setAddress (String Address)
	{
		 this.Address= Address;
	}
	private void setCity (String City)
	{
		 this.City= City;
	}
	private void setCountry (String Country)
	{
		 this.Country= Country;
	}
	/// privated cause not needed for now but might be needed in the future 
}
