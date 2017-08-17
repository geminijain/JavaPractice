package com.gemini.hackerrank;

import java.util.Scanner;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;
    
    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    
    // Print person data
    public void printPerson(){
         System.out.println(
                "Name: " + lastName + ", " + firstName 
            +   "\nID: " + idNumber); 
    }
     
}
class Student extends Person{
    private int[] testScores;
    /*  
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
  Scanner scan = new Scanner(System.in)   ;
  String Person(String firstName, String ){
    return  firstName = scan.next();
    
  }
  
  
  
        
        
    // Write your constructor here

    /*  
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    
    
}