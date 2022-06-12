package vn.com.tma.trainingplan.junitexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTestSuccessful {
	private static ICalculator calculator;
	
	@BeforeClass
	public static void initCalcultor() {
		calculator = new Calculator();
	}
	
	@Before
	public void beforeTest() {
		System.out.println("This is execute before each Test");
	}
	
	@After
	public void afterTest() {
		System.out.println("This is execute after each Test");
	}
	
	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		
		assertEquals(7, result);
	}
	
	@Test
	public void testDivison() {
		try {
			int result = calculator.division(10, 2);
			
			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.division(10, 0);
	}
	
	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);
		
		assertTrue(result);
	}
	
//	@Ignore
    @Test
    public void testSubstraction() {
        int result = 10 - 3;
 
        assertFalse(result == 9);
    }
}
