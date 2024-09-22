package com.csc;

public class BCalculator {
    

    double tgross;
    double _socialtax;
    double _federaltax ;
    double _statetax;
    double _insurance;
    double _Localuniontax;
    double _lifeIns;
    float payrate;

    public double lifeIns (double lifeins)
    {
       if (lifeins == 1)
       {
        _lifeIns = 0;
        return  _lifeIns;
       }
       else if (lifeins == 2)
       {
        _lifeIns = 5;
        return  _lifeIns;
       }
       else if (lifeins == 3)
       {
        _lifeIns = 10;
        return  _lifeIns;
       }
       else 
       {
        _lifeIns = 15;
        return  _lifeIns;
       }


    }

    
    public double Gross(float hoursworked,float payrate)
    {
    
        if (hoursworked <= 40.00)
        {
            tgross = hoursworked*payrate;
            return tgross;
        }
        else 
        {
             double extrah = (hoursworked-40)*(payrate*1.5);
             double ngross = 40.00*payrate;
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
 
    public double[] NetPay(double tgross)
    {
        double totalExp = (_socialtax + _federaltax + _statetax + _lifeIns);
        double ppay = (tgross - totalExp);
 
        double morex = _Localuniontax + _insurance;
        
        if ((ppay - morex )>0)
        {
            double _netpay = (ppay - morex);
            double[] netpay = {_netpay, 1};
            return netpay;

        }
        else{
            
            if ((ppay - _Localuniontax) > 0)
            {
                double _netpay = (ppay - _Localuniontax);
                double[] netpay = {_netpay, 2};
                return netpay;
                
            }
            else{

                double _netpay = ppay;
                double[] netpay = {_netpay, 3};
                return netpay;
            }
        }  
    }
    



}
