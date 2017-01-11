package fr.demos.cinepantin;

import static org.junit.Assert.*;
import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {
	@Before
	public void setUp() throws Exception
	{
		
	}

	@Test
	public void test1() {
		  try { 
			  ClassPathXmlApplicationContext app= new ClassPathXmlApplicationContext(new String[]{"servlet-context.xml"});
			  assertTrue(true); 
			  } catch (Exception e) {
				  assertTrue(e.getMessage(),false); 
				  } 
		  } 
	}


