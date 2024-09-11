package com.csc;

public class Report {

    BCalculator calobject = new BCalculator();
    public void checks (double hoursworked, int dependents)
    {   
        System.out.println("\r\nPayroll Stub:"); 
        System.out.println("\r\n\tWorked hours: " + hoursworked + " hrs.\r\n\tRate:         16.78$/hr");
        System.out.println("\tDependents:   " + dependents);
        double tgross = calobject.Gross(hoursworked);
        System.out.println("\r\n\tGross:    $" + String.format("%.2f",tgross));
        
    double  _socialtax = calobject.socialsec(tgross);
    System.out.println("\r\n\tSocSec: $ " + String.format("%.2f", _socialtax));

    double  _federaltax = calobject.federaltax(tgross);
    System.out.println("\tFedTax: $ " + String.format("%.2f",_federaltax));

    double  _statetax = calobject.statetax(tgross);
    System.out.println("\tStTax:  $ " + String.format("%.2f", _statetax));

    double  _Localuniontax = calobject.Localtax();
    System.out.println("\tUnion:  $ " + String.format("%.2f",_Localuniontax));

    double  _insurance = calobject.insurance(dependents);
    System.out.println("\tIns:    $ " + String.format("%.2f",_insurance));
    
    double  _netpay = calobject.NetPay(tgross);
    System.out.println("\r\n\r\n\tNet:    $ " + String.format("%.2f", _netpay));

    System.out.println("\r\nThank you for using the Payroll Program!\r\n");

    }
    
    
    
}

 

