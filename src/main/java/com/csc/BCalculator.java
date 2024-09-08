package com.csc;

public class BCalculator {
    

    double tgross;
    double _socialtax;
    double _federaltax ;
    double _statetax;
    double _insurance;
    double _Localuniontax;
    
    public double Gross(double hoursworked)
    {
    
        if (hoursworked <= 40)
        {
            tgross = hoursworked*16.78;
            return tgross;
        }
        else 
        {
             double extrah = (hoursworked-40)*(16.78*1.5);
             double ngross = 40*16.78;
             tgross = extrah + ngross;
             return tgross;
        }
        
    }

   
    public double socialsec (double tgross)
    {
          _socialtax = (0.06*tgross);
          return _socialtax;
    }
    public double federaltax (double tgross)
    {
        _federaltax = (0.14*tgross);
        return _federaltax;
    }
    public double statetax (double tgross)
    {
        _statetax = (0.05*tgross);
        return _statetax;
    }
    
    public double Localtax ()
    {
       _Localuniontax = 10.00;
       return _Localuniontax;
    }
    
    public double insurance(int dependents)
    {
        if (dependents < 3)
        {
            _insurance = 15.00;
            return _insurance;
        }
        else{
            
            _insurance = 35.00;
            return  _insurance;
        } 

    }
 
    public double NetPay(double tgross)
    {
        double totalExp = (_socialtax + _federaltax + _statetax + _Localuniontax + _insurance);
        double _netpay = (tgross - totalExp);

        return _netpay;
    }
    



}
