package com.csc;
import java.util.Scanner;

public class Payroll {

  public static void main(String[] args){
 System.out.println(
   "Welcome to your payroll calculator");
    System.out.println("Enter the hours you have worked this week: ");
    Scanner in = new Scanner(System.in);
    double hoursworked = in.nextInt();
    System.out.println("Now, enter the number of dependents: ");
    int dependents = in.nextInt();
    in.close();

    Report reportobject = new Report();

    reportobject.checks(hoursworked,dependents);
    
  }
 
  
}

