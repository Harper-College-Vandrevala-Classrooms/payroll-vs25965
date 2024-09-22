package com.csc;

public class Report {

    BCalculator calobject = new BCalculator();
    public void checks (float hoursworked, int dependents, float payrate, double _lifeIns)
    {   
        System.out.println("\r\nPayroll Stub:"); 
        System.out.print("\r\n\tWorked hours: " + String.format("%.2f",hoursworked) + " hrs");
        System.out.print("\r\n\tRate:  " + String.format("%.2f",payrate) + " $/hr");
        System.out.println("\r\n\tDependents:  " + dependents);
        double tgross = calobject.Gross(hoursworked,payrate);
        System.out.println("\r\n\tGross:    $" + String.format("%.2f",tgross));
        
    double  _socialtax = calobject.socialsec(tgross);
    System.out.println("\r\n\tSocSec: $ " + String.format("%.2f", _socialtax));

    double  _federaltax = calobject.federaltax(tgross);
    System.out.println("\tFedTax: $ " + String.format("%.2f",_federaltax));

    double  _statetax = calobject.statetax(tgross);
    System.out.println("\tStTax:  $ " + String.format("%.2f", _statetax));

    double _lifeins = calobject.lifeIns(_lifeIns);
    if (_lifeins == 0)
    {
      System.out.println("\tLifeIns:  $ " + String.format("%.2f",_lifeins));
    }
    if (_lifeins == 5)
    {
      System.out.println("\tLifeIns:  $ " + String.format("%.2f",_lifeins));
    }
    if (_lifeins == 10)
    {
      System.out.println("\tLifeIns:  $ " + String.format("%.2f",_lifeins));
    }
    else if (_lifeins == 15)
    {
      System.out.println("\tLifeIns:  $ " + String.format("%.2f",_lifeins));
    }

    double  _Localuniontax = calobject.Localtax();
    double  _insurance = calobject.insurance(dependents); 
    double[]  _netpay = calobject.NetPay(tgross);
    
    if (_netpay[1] == 1)
    { 
    System.out.println("\tUnion:  $ " + String.format("%.2f",_Localuniontax));
    System.out.println("\tIns:    $ " + String.format("%.2f",_insurance));
    System.out.println("\r\n\r\n\tNet:    $ " + String.format("%.2f", _netpay[0]));
    System.out.println("\r\nThank you for using the Payroll Program!\r\n");
    }
    else if (_netpay[1] == 2)
    {
        System.out.println("\tUnion:  $ " + String.format("%.2f",_Localuniontax));
        System.out.println("\r\n\tNet:    $ " + String.format("%.2f", _netpay[0]));
        System.out.println("\r\nThe employee still owes:");
        System.out.println("\tIns:    $ " + String.format("%.2f",_insurance));
    }
    else if (_netpay[1] == 3)
    {
        System.out.println("\r\n\tNet:    $ " + String.format("%.2f", _netpay[0]));
        System.out.println("\r\nThe employee still owes:");
        System.out.println("\tUnion:  $ " + String.format("%.2f",_Localuniontax));
        System.out.println("\tIns:    $ " + String.format("%.2f",_insurance));
    }
    }
}

 

