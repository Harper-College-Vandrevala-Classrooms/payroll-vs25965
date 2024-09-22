package com.csc;
import java.util.Scanner;

public class Payroll {

  public static void main(String[] args){
    
    Report reportobject = new Report();

    System.out.println("Welcome to your payroll calculator");
    System.out.println("Enter the hours you have worked this week: ");
    Scanner in = new Scanner(System.in);
    float hoursworked = in.nextFloat();
    System.out.println("Now, enter the number of dependents: ");
    int dependents = in.nextInt();
    System.out.println("What is your hourly pay rate: ");
    float payrate  = in.nextFloat();
    
    if (payrate < 0) 
    {
      while(payrate < 0)
      { 
        System.out.println("Enter a positive number for your hourly pay rate: ");
        float npayrate  = in.nextFloat();
        payrate = npayrate;
      }
      
      if (dependents < 0){
             dependents = 0;
           }
    }

    else if (payrate > 0){

      if (dependents < 0){
        dependents = 0;
      }
    }

    System.out.println("Which life insurance plan do you want to select? ");
    System.out.println("\r\n\t(1) no plan\r\n\t(2) single plan\r\n\t(3) married plan\r\n\t(4) married with children plan");
    double _lifeIns = in.nextInt();

    if (_lifeIns == 4 && dependents == 0){
      while (_lifeIns == 4)
      {
       System.out.println("Sorry! You need at least one child to select that plan.");
       System.out.println("\r\nWhich life insurance plan do you want to select? ");
       System.out.println("\r\n\t(1) no plan\r\n\t(2) single plan\r\n\t(3) married plan\r\n\t(4) married with children plan");
       double lifeIns = in.nextInt();
       _lifeIns = lifeIns;

      }
     }
     else if (_lifeIns<1 || _lifeIns >5){

       while (_lifeIns<1 || _lifeIns >5)
      {
       System.out.println("Sorry! You chose a number that has not been assigned to a life insurance plan.");
       System.out.println("\r\nWhich life insurance plan do you want to select? ");
       System.out.println("\r\n\t(1) no plan\r\n\t(2) single plan\r\n\t(3) married plan\r\n\t(4) married with children plan");
       double lifeIns = in.nextInt();
       _lifeIns = lifeIns;
      }
    }

    reportobject.checks(hoursworked,dependents,payrate,_lifeIns);
    in.close();
}
  
  }


