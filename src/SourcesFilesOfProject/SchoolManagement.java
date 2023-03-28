package SourcesFilesOfProject;
import java.util.Scanner;
import java.util.ArrayList;

public class SchoolManagement {
	//methods Add remove search list exit 
	private ArrayList <Teacher> Teachers = new <Teacher> ArrayList();
	public void Add()
	{
		Teacher newTeacher = new Teacher();
		for(int i =0; i<Teachers.size(); i++)
		{
			while(newTeacher.getID()==Teachers.get(i).getID())
			{
				Scanner Scan= new Scanner(System.in);
				System.out.print("\t\t\t\tEnter a valid ID. Previous ID already taken! ");
				int id= Scan.nextInt();
				newTeacher.setID(id);
			}
		}
		Teachers.add(newTeacher);
		System.out.print("\t\t\t\tTeacher Added To The List Suceessfully.\n");
		return;
	}
	public void Search()
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("\n\t\t\t\tEnter the name of the teacher to search: ");
		String Name = scan.nextLine();
		boolean entryMatchFlag= false;
		for(int i= 0;i< Teachers.size();i++ )
		{
			int counter=1;
			if(Teachers.get(i).getName()== Name)
			{
				if(counter==1)
					System.out.print("\n\t\t\t\tDetails of the teacher/teachers named:" + Name);
				System.out.print("\n\t\t\t\tName: "+ Teachers.get(i).getName());
				System.out.print("\n\t\t\t\tBirthday: "+ Teachers.get(i).getBirthday());
				System.out.print("\n\t\t\t\tSubject: "+ Teachers.get(i).getSubject());
				System.out.print("\n\t\t\t\tSalary: "+ Teachers.get(i).getSalary());
				System.out.print("\n\t\t\t\tAddress: "+ Teachers.get(i).getAddress());
				System.out.print("\n\t\t\t\tCity: "+ Teachers.get(i).getCity());
				System.out.print("\n\t\t\t\tCountry: "+ Teachers.get(i).getCountry());
				if(i==0)
				entryMatchFlag=true;
				counter++;
				
			}
		}
		if(entryMatchFlag== false)
			System.out.println("\n\t\t\t\tName does not match any teacher in the list.");
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
		System.out.print("\n\t\t\t\tEnter the ID of the teacher to search: ");
		int id = scan.nextInt();
		boolean entryFlag= false;
		for(int i= 0;i< Teachers.size();i++ )
		{
			
			if(Teachers.get(i).getID()== id)
			{
				Teachers.remove(i);
				System.out.print("\n\t\t\t\tThe Teacher Has Been Removed From The List Successfullyq1.\n");
				entryFlag=true;
				return;
			}
		}
		if(entryFlag== false)
			System.out.println("\n\t\t\t\tID does not match any teacher.");
		return;
	}
	
	
	
}
