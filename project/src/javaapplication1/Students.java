/*

package javaapplication1;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Students {
	public String stdname;
	public String pass;
	public int id;
	public String feedback;
	public List<String> list2;
	public int std_id;
	public String std_name;
	public String WorkshpName;
  
	Scanner st = new Scanner(System.in);
	public String login(String u_name, int id, String pass) {
		if (u_name.equals(stdname) && id==this.id && pass.equals(this.pass))
		{
		    return "Login Sucessful";
		}
		else {return "Login Failed";}
		}


 public void prov_feed ()
    {
	    System.out.println("Enter Student ID" + "\n");
		std_id = st.nextInt();
		st.nextLine();
		System.out.println("Enter Student NAME" + "\n");
		std_name = st.nextLine();
		st.nextLine();
		System.out.println("Enter Student Workshop NAME" + "\n");
		WorkshpName = st.nextLine();
		st.nextLine();
		
		
		
		System.out.println("PROVIDE FEEDBACK");
		feedback = st.nextLine();
	    String fd_file = "feedback.txt";
	try
	{
	PrintWriter pw = new PrintWriter(new FileWriter(fd_file,true));
	list2 = new ArrayList<String>(1000);
	list2.add("StudentID : " +std_id+ "StudentNAME : " +std_name+ "Workshpname :" +WorkshpName+ "StudentFeedback : "+feedback);
	pw.println(list2);
	pw.close();
	pw.println("\n");
	System.out.println("succesfully added feedback");}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
   }

}

