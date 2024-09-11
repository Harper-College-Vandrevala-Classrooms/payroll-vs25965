package com.csc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBCalculator {

  
    BCalculator bcalculator;

    @BeforeEach
   void setUp() {
     bcalculator = new BCalculator();
   }
 
   @Test
   void grosstestforzerohours(){
     assertEquals(bcalculator.Gross(0),0);
   }
   @Test
   void grosstestforfortyhours(){
     assertEquals(bcalculator.Gross(40),671.2);
   }
   @Test
   void grosstestforsixtyhours(){
     assertEquals(bcalculator.Gross(60),1174.6000000000001);
   }
   
   @Test
   void insurancetestfewdepents(){
     assertEquals(bcalculator.insurance(1),15.00);
   }
   @Test
   void insurancetestmoredepents(){
     assertEquals(bcalculator.insurance(3),35.00);
   }
  
   @Test
   void federaltaxtestforfortyhours(){
     assertEquals(bcalculator.federaltax(671.2),93.96800000000002);
   }
   @Test
   void federaltaxtestforsixtyhours(){
     assertEquals(bcalculator.federaltax(1174.6000000000001),164.44400000000005);
   }
   @Test
   void socialsectestforfortyhours(){
     assertEquals(bcalculator.socialsec(671.2),40.272);
   }
   @Test
   void statetaxtestforfortyhours(){
     assertEquals(bcalculator.statetax(671.20),33.56);
   }
  }
   

