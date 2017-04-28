/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author varisha ajaz
 */
public class MainApp {

    private static Scanner in;

	/**
     * @param args the command line arguments
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
    	
        in = new Scanner(System.in);
    String 	uname ;		 
    		int id;
    		String pass;
    		 System.out.println("Enter a User Name:");
    		uname=in.nextLine();
    		 System.out.println("Enter a Id:");
    		id=in.nextInt();
    		 System.out.println("Enter a Password:");
     		pass=in.next();
     		Login Login=new Login();
    	 Login.log(uname, id, pass);
    	 
    }
    
}
