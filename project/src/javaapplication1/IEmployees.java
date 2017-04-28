/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.util.Date;

/**
 *
 * @author varisha ajaz
 */
public interface IEmployees {
    
int id=0;
String pass=null;
int age=0;

Date hireDate=null;
int salary=0;
String name=null;
String contact=null;
String address=null;
public String login(String u_name,int id,String pass) throws FileNotFoundException;
public void view(Students stud);
}
