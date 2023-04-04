package SourcesFilesOfProject;
import java.util.Scanner;
import java.util.ArrayList;

public class SchoolManagement {
	//methods Add remove search list exit 
	private ArrayList <Teacher> Teachers = new <Teacher> ArrayList();
	private ArrayList <String> TeachersName = new <String> ArrayList();
	private ArrayList <Integer> TeachersID = new <Integer> ArrayList();
	
	public void Add()
	{
		Teacher newTeacher = new Teacher();
		Scanner scan= new Scanner(System.in);
		newTeacher.setAddress(null);
		 System.out.print("\n\t\t\t\tEnter the Name: ");
		 newTeacher.setName(scan.nextLine());
		 System.out.print("\n\t\t\t\tEnter the Birthday[DD/MN/YEAR]: ");
		 newTeacher.setBirthday(scan.nextLine());
		 System.out.print("\n\t\t\t\tEnter the Subject: ");
		 newTeacher.setSubject(scan.nextLine()) ;
		 System.out.print("\n\t\t\t\tEnter the Salary: ");
		 //float floatSalary = );
		 newTeacher.setSalary(Float.parseFloat(scan.nextLine()));
		 System.out.print("\n\t\t\t\tEnter the Address: ");
		 newTeacher.setAddress(scan.nextLine());
		 System.out.print("\n\t\t\t\tEnter the City: ");
		 newTeacher.setCity(scan.nextLine());
		 System.out.print("\n\t\t\t\tEnter the Country: ");
		 newTeacher.setCountry(scan.nextLine()); 	
		Teachers.add(newTeacher);
		TeachersName.add(newTeacher.getName());//to use contain method for name search
		TeachersID.add(newTeacher.getID());//to use contain method for removing teacher
		System.out.print("\t\t\t\tTeacher Added To The List Suceessfully.\n");
		return;
	}
	public void Search()
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("\n\t\t\t\tEnter the name of the teacher to search: ");
		int counter=1;
		String Name = scan.nextLine();

//	using contains method of array list but to implemented it with ArrayList of Class, the contains method needs to override
		if(TeachersName.contains(Name)==true)
		{
		 int matchedIndex= TeachersName.indexOf(Name);
		 if(matchedIndex==TeachersName.lastIndexOf(Name))
		 {
			 System.out.print("\n\t\t\t\tDetails of the teacher/teachers named:" + Name);
				System.out.print("\n\n\t\t\t\tName: "+ Teachers.get(matchedIndex).getName());
				System.out.print("\n\t\t\t\tBirthday: "+ Teachers.get(matchedIndex).getBirthday());
				System.out.print("\n\t\t\t\tSubject: "+ Teachers.get(matchedIndex).getSubject());
				System.out.print("\n\t\t\t\tSalary: "+ Teachers.get(matchedIndex).getSalary());
				System.out.print("\n\t\t\t\tAddress: "+ Teachers.get(matchedIndex).getAddress());
				System.out.print("\n\t\t\t\tCity: "+ Teachers.get(matchedIndex).getCity());
				System.out.print("\n\t\t\t\tCountry: "+ Teachers.get(matchedIndex).getCountry());
				
				return;
		 }
		 else
		 {
			 ArrayList<Integer> indices= new <Integer> ArrayList();
			 indices.add(matchedIndex);
			 indices.add(TeachersName.lastIndexOf(Name));
			 int terminationCondition= TeachersName.lastIndexOf(Name);
			 //Traversing in between first and last occurrence
			 int matched=0;
			 for(int i=1;i<terminationCondition; i++)
			 {
				 if(Teachers.get(i).getName().equals(Name))
				 {
					 matched++;
					 indices.add(matched,i);
				 }
			 }
			 if(matched==0)
			 {
				 System.out.print("\n\t\t\t\tDetails of the teacher/teachers named:" + Name);
					System.out.print("\n\n\t\t\t\tName: "+ Teachers.get(matchedIndex).getName());
					System.out.print("\n\t\t\t\tBirthday: "+ Teachers.get(matchedIndex).getBirthday());
					System.out.print("\n\t\t\t\tSubject: "+ Teachers.get(matchedIndex).getSubject());
					System.out.print("\n\t\t\t\tSalary: "+ Teachers.get(matchedIndex).getSalary());
					System.out.print("\n\t\t\t\tAddress: "+ Teachers.get(matchedIndex).getAddress());
					System.out.print("\n\t\t\t\tCity: "+ Teachers.get(matchedIndex).getCity());
					System.out.print("\n\t\t\t\tCountry: "+ Teachers.get(matchedIndex).getCountry());
					
					System.out.print("\n\n\t\t\t\tName: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getName());
					System.out.print("\n\t\t\t\tBirthday: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getBirthday());
					System.out.print("\n\t\t\t\tSubject: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getSubject());
					System.out.print("\n\t\t\t\tSalary: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getSalary());
					System.out.print("\n\t\t\t\tAddress: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getAddress());
					System.out.print("\n\t\t\t\tCity: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getCity());
					System.out.print("\n\t\t\t\tCountry: "+ Teachers.get(TeachersName.lastIndexOf(Name)).getCountry());
					
					return;
			 }
			 else
			 {
				 //traversing through the multiple teachers with similar names to print their details
				 for(int i=0;i<indices.size();i++)
				 {
					 if(i==0)
							System.out.print("\n\t\t\t\tDetails of the teacher/teachers named:" + Name);
						System.out.print("\n\n\t\t\t\tName: "+ Teachers.get(indices.get(i)).getName());
						System.out.print("\n\t\t\t\tBirthday: "+ Teachers.get(indices.get(i)).getBirthday());
						System.out.print("\n\t\t\t\tSubject: "+ Teachers.get(indices.get(i)).getSubject());
						System.out.print("\n\t\t\t\tSalary: "+ Teachers.get(indices.get(i)).getSalary());
						System.out.print("\n\t\t\t\tAddress: "+ Teachers.get(indices.get(i)).getAddress());
						System.out.print("\n\t\t\t\tCity: "+ Teachers.get(indices.get(i)).getCity());
						System.out.print("\n\t\t\t\tCountry: "+ Teachers.get(indices.get(i)).getCountry()); 
				 }
				 return;
			 }	 
		 }
		}
		else
		 {
				System.out.println("\n\t\t\t\tName does not match any teacher in the list.");
		 }
		return;
	}
	public void List()
	{
		boolean emptyListFlag= true;
		for(int i=0; i< Teachers.size();i++)
		{
			if(i==0)
				System.out.print("\t\t\t\tThe List Of The Teachers are as Follow: ");
			if(i>0)
				System.out.print("\n");
			System.out.print("\n\t\t\t\tID: "+ Teachers.get(i).getID());
			System.out.print("\n\t\t\t\tName: "+ Teachers.get(i).getName());
			System.out.print("\n\t\t\t\tBirthday: "+ Teachers.get(i).getBirthday());
			System.out.print("\n\t\t\t\tSubject: "+ Teachers.get(i).getSubject());
			System.out.print("\n\t\t\t\tSalary: "+ Teachers.get(i).getSalary());
			System.out.print("\n\t\t\t\tAddress: "+ Teachers.get(i).getAddress());
			System.out.print("\n\t\t\t\tCity: "+ Teachers.get(i).getCity());
			System.out.print("\n\t\t\t\tCountry: "+ Teachers.get(i).getCountry()+"\n");
			if(i==0)
				emptyListFlag=false;
		}
		if(emptyListFlag==true)
			System.out.print("\t\t\t\tThere is no Teacher in the list.\n\t\t\t\tThe List Is Empty.\n");
		
		return;
	}
	public void Remove()
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("\n\t\t\t\tEnter the ID of the teacher to be removed: ");
		int id = scan.nextInt();
		if(TeachersID.contains(id)==true)
		{
			TeachersName.remove(TeachersID.indexOf(id))	;//removing name from the namelist
			Teachers.remove(TeachersID.indexOf(id));//removing the teacher
			System.out.print("\n\t\t\t\tThe Teacher Has Been Removed From The List Successfully.\n");
			return;
		}
		else
		{
			System.out.println("\n\t\t\t\tID does not match any teacher.");
			return;
		}
//		boolean entryFlag= false;
//		for(int i= 0;i< Teachers.size();i++ )
//		{
//			
//			if(Teachers.get(i).getID()== id)
//			{
//				Teachers.remove(i);
//				System.out.print("\n\t\t\t\tThe Teacher Has Been Removed From The List Successfully.\n");
//				entryFlag=true;
//				return;
//			}
//		}
//		if(entryFlag== false)
//			System.out.println("\n\t\t\t\tID does not match any teacher.");
//		return;
	}
	
	
	
}
