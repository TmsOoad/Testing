/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author varisha ajaz
 */
public class Finance_Manager implements IEmployees
{
 public String username;
 public int id;
public String pass;
public Date hiredate;									// RIDA ko send krni hai
public int salary;
public String name;
public String contact;
public String address;
public String login(String u_name,int id, String pass){
if (u_name.equals(username) && id==this.id && pass.equals(this.pass))
{
    return "Login Sucessful";
}
else {return "Login Failed";}
}
@Override
public void view (Students stud){}

    
    public void add(Students new_stud) {
      
    }
}
