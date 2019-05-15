package mutationExample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {

	private Calc calc;
	@Before
	public void setUp() throws Exception {
		this.calc= new Calc();
	}

	@Test
	public void testSuma() {
		assertEquals(4, this.calc.suma(2, 2));
	}

	@Test
	public void testResta() {
		assertEquals(0, this.calc.resta(2,2));
	}

	@Test
	public void testMult(){
		assertEquals(4, this.calc.mult(2, 2));
	}
	
	@Test
	public void testCocient() {
		assertEquals(1, calc.div(2, 2));
	}
}
