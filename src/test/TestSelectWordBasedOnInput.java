package test;

import static org.junit.Assert.*;

import org.junit.Test;

 public class TestSelectWordBasedOnInput {
	 SelectWordBasedOnInput sw = null;
	 
	 public void Setup() {
			sw = new SelectWordBasedOnInput();
	 }

	 @Test
	public void returnWordIfNumberDividableByThree() throws Exception{
		assertEquals("word", SelectWordBasedOnInput.getResult(-3));
	}
	
	@Test
	public void doNotReturnWordIfNumberNotDividableByThree() throws Exception{
		assertNotEquals("word", SelectWordBasedOnInput.getResult(4));
	}
	
	@Test
	public void returnSmithIfNumberDividableByFive() throws Exception{
		assertEquals("smith", SelectWordBasedOnInput.getResult(5));
	}
	
	@Test
	public void doNotReturnSmithIfNumberNotDividableByFive() throws Exception{
		assertNotEquals("smith", SelectWordBasedOnInput.getResult(4));
	}
	
	@Test
	public void returnWordSmithIfNumberDividableByFifteen() throws Exception{
		assertEquals("wordsmith", SelectWordBasedOnInput.getResult(15));
	}
	
	@Test
	public void doNotReturnWordSmithIfNumberNotDividableByFifteen() throws Exception{
		assertNotEquals("wordsmith", SelectWordBasedOnInput.getResult(4));
	}

	@Test
	public void returnSameNumberIfNumberDividableByEitherThreeFiveFifteen() throws Exception{
		assertEquals("37", SelectWordBasedOnInput.getResult(37));
	}
	
	@Test
	public void returnWordSmithIfNegativeNumberAndDividableByFifteen() throws Exception{
		assertEquals("wordsmith", SelectWordBasedOnInput.getResult(-300));
	}
	
	@Test
	public void returnWordSmithIfNumberIsZero() throws Exception{
		assertEquals("wordsmith", SelectWordBasedOnInput.getResult(0));
	}
	
}
