package javaapplication1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner; 

public class Coordinator  {
	private static Scanner in = new Scanner(System.in);
	public int id;
	public String pass;
	public int age;
	public Date hiredate;
	public int salary;
	public String name;
	public String contact;
	public String address;
	public String Course;
	 public List<String> myList  ;
	 public void menu()
	 { int choise=1;
 
	   while (choise!=0)
	  { System.out.println("1. Add New student");
	   System.out.println("2. Remove Student");
	   System.out.println("3. View All student");
	   System.out.println("4. update student ");
	   System.out.println("5.Add New Trainer ");
	   System.out.println("6.View All Trainer");
	   System.out.println("7. Remove Trainer ");
	   System.out.println("0. Exit");
	   choise=in.nextInt();
	  
	       switch(choise){
	           case 1: add_Student();break;
	           case 2: viewstudents(); break;
	           case 0: System.out.println("closing...");
	           System.exit(0);
	           ;break;
	           default: System.out.println("Invalid Input,Try Again");
	        	   break;
	         }
	  }
	 }
	 
		public void add_Student(){
			
			System.out.println("Enter a Id:");
			int id=in.nextInt();
			in.nextLine(); 
			
			System.out.println("Enter a Name:");
			 String name=in.nextLine();
			 System.out.println("Enter a Age:");
				int age=in.nextInt();
				in.nextLine();
				System.out.println("Enter a ContactNo:");
				
				 String contact=in.nextLine();
				 System.out.println("Enter a Address:");
				 String Address=in.nextLine();
			  
			 System.out.println("Enter a Course:");
	 	   String course=in.next();
			String filename="student.txt";
			try {
				PrintWriter pr=new PrintWriter(new FileWriter( filename,true));
				myList= new ArrayList<String>(1000);
				myList.add("Id: " + id+ "Name: " + name + " Age: " + age + " Contact: " + contact+" Address: " +Address+  " course: " + course);
			pr.println(myList);	 
			pr.close();
			pr.println('\n');
			System.out.println("added");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 
		}
		public void viewstudents()
		{
			File f = new File("student.txt");
            FileReader r;
			try {
				r = new FileReader(f);
				BufferedReader reader = new BufferedReader(r);

	            String line = null;

	            while((line = reader.readLine()) != null) 
	            {
	                System.out.println(line);
	            }
           reader.close();
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
		}
		
	 
		public void remove(String name){
		 
			
		};                  
		public void edit(Students ed_student){};
		public void remove_trainer(Trainer rem_trainer){};

		public void edit_Trainer(Trainer ed_trainer){};
	

	 

}
