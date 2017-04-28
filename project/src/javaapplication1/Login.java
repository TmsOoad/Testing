package javaapplication1;

//import java.util.Scanner;

public class Login {
	
	 public int id;
	public String pass;
	public String u_name;
	boolean a= false;
	public  void log (String u_name, int id,String pass)
	{//boolean a= false;
		/*while(a)
		{*/
		if (u_name.equals("Manager")&& id==59622 && pass.equals("hadia"))
		{
			//new Scanner(System.in); 
			
			System.out.println("Login Sucessful");
					
		Coordinator cr=new Coordinator();
		cr.menu();
	 
 	   
		}
		else if(u_name.equals("student")&& id==59655 && pass.equals("iqra"))
		{
			 
			System.out.println("Login Sucessful");
			
			//a=true;
			//break;
		}
		
		else if(u_name.equals("trainer")&& id==59645 && pass.equals("varisha"))
		{
			 
			System.out.println("Login Sucessful");
			//a=true;
			//break;
		}
		else
		{
			//a=false;
			System.out.println("Login Not Sucessful");
		}
			
	}
		}
//}
