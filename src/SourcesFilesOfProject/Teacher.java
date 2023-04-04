package SourcesFilesOfProject;

public class Teacher 
{
	static int idGenerator=1;
	private String Name;
	private String Birthday;
	private String Subject;
	private int ID=idGenerator++;
	private float Salary;
	private String Address;
	private String City;
	private String Country;
	
	
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
	public void setName (String Name) 
	{
		 this.Name = Name;
	}
	public void setBirthday (String Birthday)
	{
		this.Birthday= Birthday;
	}
	public void setSubject (String Subject)
	{
		 this.Subject= Subject;
	}
	private void setID (int ID) 
	{
		 this.ID = ID;
	}	
	public void setSalary (float salary) 
	{
		 this.Salary= salary;
	}
	public void setAddress (String Address)
	{
		 this.Address= Address;
	}
	public void setCity (String City)
	{
		 this.City= City;
	}
	public void setCountry (String Country)
	{
		 this.Country= Country;
	}
	/// privated cause not needed for now but might be needed in the future 
}
