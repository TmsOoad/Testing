package javaapplication1;
import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.List;


public class Planner
{
	public String Wname;
	public String pass;
	public String Venue;
	public String date; 
	public String Day;
	public int id;
	public String name;
	public int num;
	public List<String> list;
	
	
	Scanner s = new Scanner(System.in);
	
	public String login(String u_name, int id, String pass) {
		if (u_name.equals(name) && id==this.id && pass.equals(this.pass))
		{
		    return "Login Sucessful";
		}
		else {return "Login Failed";}
		}
	

	
	  public void Planning()
	  {     int num=1;
	       
		   while (num!=0)
		  {
			   System.out.println("1:CREATE SCHEDULE FOR WORK SHOP");
				  System.out.println("2:VIEW SCEHDULE FOR WORK SHOP");
				  System.out.println("3:EXIT");
				  num = s.nextInt();
				  
				  
		       switch(num){
		           case 1: workshopSchedule();break;
		           case 2: ViewworkshopSchedule(); break;
		           case 3: System.out.println("Exit...");
		           System.exit(3);
		           ;break;
		           default: System.out.println("Invalid Input,Try Again");
		        	   break;
		         }
		  }
		
		 
		
			  
		 }
		
	
	public void workshopSchedule()
	{
		System.out.println("1:add workshop");
		Wname = s.nextLine();
		System.out.println("2:add venue");
		Venue = s.nextLine();
		System.out.println("3:add date");
		date = s.nextLine();
		System.out.println("4:add Day");
		Day = s.nextLine();
		
	
	String Filename = "workshop.txt";
	try
	{
	PrintWriter pw = new PrintWriter(new FileWriter(Filename,true));
	list = new ArrayList<String>(1000);
	list.add("Workshop: "+Wname  +"Venue: " + Venue    +  "Date: " +  date    +  "Day: " + Day);
	pw.println(list);
	pw.close();
	pw.println("\n");
	System.out.println("succesfully added");}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void ViewworkshopSchedule()
	{

		File file = new File("workshop.txt");
        FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);

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
	
	
}
	
	
	
	
	
	
	




