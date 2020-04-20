package test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MathTest {

	@Test
	public void testAddition() {
		Assert.assertEquals(2, 1 + 1);
	}

	@Test
	public void testSubstraction() {
		Assert.assertEquals(0, 1 - 1);
	}
	
	@Test
	public void testMultiplication() {
		Assert.assertEquals(1, 1 * 1);
	}
	
	@Test
	public void testDivision() {
		Assert.assertEquals(1, 1 / 1);
	}
}
