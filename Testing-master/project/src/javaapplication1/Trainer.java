 package javaapplication1;

import java.util.Date;

public class Trainer implements IEmployees {
	public int id;
	public String pass;
	public int age;
	public Date hiredate;
	public int salary;
	public String name;
	public String contact;
	public String address;

	@Override
	public String login(String u_name, int id, String pass)     
	{
		if (u_name.equals(name) && id==this.id && pass.equals(this.pass))
		{
		    return "Login Sucessful";
		}
		else {return "Login Failed";}
		};
 public void edit_Trainer(Trainer ed_trainer){};
 
	

	@Override
	public void view(Students stud) {};
	

}
