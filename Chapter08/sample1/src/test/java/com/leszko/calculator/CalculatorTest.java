package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// class for testing calculator
public class CalculatorTest {
 	//create a instance 
     private Calculator calculator = new Calculator();
	//run a quick test
     @Test
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}
