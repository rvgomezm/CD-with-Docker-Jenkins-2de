package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
// comment
public class CalculatorTest {
     private Calculator calculator = new Calculator();
     /**
      * comment
      *
      **/
     public void testSum() {
          assertEquals(5, calculator.sum(2, 3));
     }
}
