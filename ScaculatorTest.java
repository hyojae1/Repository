package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import StringCaculator.Scaculator;

public class ScaculatorTest {
	
	private Scaculator cal = new Scaculator();
	private int add_result = 0;	
	
	@Before
	public void Setup() {
        cal = new Scaculator();	
        
	}
	
	@Test
	public void test1()  {
		add_result = cal.sum("//;\n1;2;3");
	}
	
	@Test 
	public void test2() {
		add_result = cal.sum("-1;2;3");
	}
	
	@Test
	public void test3() {
		add_result = cal.sum("//,\n1,2,3");
	}
	
	@Test
	public void test4() {
		add_result = cal.sum(null);
	}
	
	@After
	public void result() {		
		System.out.println("°á°ú: " + add_result);
	}
	
}
