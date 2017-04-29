/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

//import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
//import java.util.ArrayList;//
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author varisha ajaz
 */
public class Manager implements IEmployees  {
public int id;
public String pass;
public int age;
public Date hiredate;
public int salary;
public String name;
public String contact;
public String address;

//private Scanner r;
@Override
public String login (String u_name, int id,String pass) 
{
	return "successful";
	/*System.out.println(u_name+id+pass);
	ArrayList<String> LognList=new ArrayList();
	Scanner LoginListFile=new Scanner(new FileReader("login"));
	String FileLine;

	while(LoginListFile.hasNextLine())
	{
		FileLine=LoginListFile.nextLine();
		LognList.add(FileLine);
		
	}
	LoginListFile.close();
	boolean LoginSucess=false;
	int index1=0;
	int index2=0;
	int index3=0;
while(index1<LognList.size()){
	System.out.println(u_name+id+pass+"1");
	System.out.println(LognList.get(index1));
	if(u_name.equals(LognList.get(index1)))){
		while(index2<LognList.size())
		{
			System.out.println(u_name+id+pass+"2");
			if(LognList.get(index2)==Integer.toString(id))
			{
				while(index3<LognList.size())
				{
					System.out.println(u_name+id+pass+"3");
					if(LognList.get(index3)==pass)
					{
						LoginSucess=true;
					}
					else
					{
						index3++;
						
					}
				}//end of while 3
				
				break;
			}
			else 
			{
				index2++;
			}
			
		}//end of while 2
		break;
	}
	else {
		index1++;
		
	}
	
	
}//end of frist while
	if(LoginSucess==true)
	{
		
		System.out.println("Login Sucessful");
	}
	else 
	{
		System.out.println("Login Not Sucessful");
	}
//	StreamReader file= new StreamReader("login.txt"); 
	Scanner fileS=new Scanner(new File("login"));
	List<String> temps=new ArrayList<String>();
	//File log=new File("login.txt");
	 
	boolean lo=false;
	 
	 
		r = new Scanner("login");
		r.useDelimiter(",");
		while (r.nextLine()!=null)
		{
	//	String user=r.next();
	//	int id1=r.nextInt();
		//String Pass=r.next();
			//r.next();
					 
		 if (u_name.equals(name) && pass.equals(this.pass))
		 {
		     lo =true;
		     break;
		 }
		 }//end of whle
		if(lo)
		{
			 return "Login Sucessful";
		}
		else
		  {return "Login Failed";}

		
	//} catch (FileNotFoundException e) 
	//{
		// TODO Auto-generated catch block
	//System.out.println ("file san not find");
	//}
		};
// if (u_name.equals(name) && id==this.id && pass.equals(this.pass))
//{
 //   return "Login Sucessful";
//}
//else {return "Login Failed";} */
};
public void add(Students new_stud){
    
	new_stud=new Students();
 // ArrayList list = new ArrayList();//error
    
};
public void remove(Students rem_stud){};

public void edit(Students ed_student){};
@Override
public void view(Students stud){};
}
