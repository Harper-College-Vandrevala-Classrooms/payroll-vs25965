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
    assertEquals(bcalculator.Gross(40),671.20);
  }
  @Test
  void grosstestforsixtyhours(){
    assertEquals(bcalculator.Gross(60),1174.60);
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
    assertEquals(bcalculator.federaltax(671.20),93.96);
  }
  @Test
  void federaltaxtestforsixtyhours(){
    assertEquals(bcalculator.federaltax(1174.60),164.44);
  }
  @Test
  void socialsectestforfortyhours(){
    assertEquals(bcalculator.socialsec(671.20),40.27);
  }
  @Test
  void statetaxtestforfortyhours(){
    assertEquals(bcalculator.statetax(671.20),33.56);
  }
}
