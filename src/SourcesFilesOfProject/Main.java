package SourcesFilesOfProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		int option;
		System.out.println("\t\t\t\t\t\tWELCOME");
		SchoolManagement Admin = new SchoolManagement();
		while(true)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("\n\t\t\t\tSelect an option(1--5) from the following Menu: \n");
			System.out.println("\t\t\t\t1. Add a Teacher to the existing record.");
			System.out.println("\t\t\t\t2. Search a Teacher in the existing record.");
			System.out.println("\t\t\t\t3. List the Teachers in the existing record.");
			System.out.println("\t\t\t\t4. Remove a teacher from the existing record.");
			System.out.println("\t\t\t\t5. Exit the program.\n\n\t\t\t\tSelect:");
			option= scan.nextInt();
			switch (option) 
			{
				case 1:
					Admin.Add();
					break;
				case 2:
					Admin.Search();
					break;
				case 3:
					Admin.List();
					break;
				case 4:
					Admin.Remove();
					break;
				case 5:
					System.out.print("\n\t\t\t\tExiting the Program.....");
					return;
					default:
						System.out.print("\n\t\t\t\tSelect A Valid Option!\n");
	
			}
		}
	}
	
}

