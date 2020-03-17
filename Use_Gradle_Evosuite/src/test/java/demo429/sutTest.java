/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo429;

import org.junit.Test;
import static org.junit.Assert.*;

public class sutTest {
	@Test(timeout = 4000)
	  public void test0()  throws Throwable  {
	      int int0 = sample_program.function("-43", "-43");
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void test1()  throws Throwable  {
	      String[] stringArray0 = new String[5];
	      stringArray0[0] = "6";
	      stringArray0[1] = "6";
	      sample_program.main(stringArray0);
	      assertEquals(5, stringArray0.length);
	  }

	  @Test(timeout = 4000)
	  public void test2()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        sample_program.function((String) null, (String) null);
	        fail("Expecting exception: NumberFormatException");
	      
	      } catch(NumberFormatException e) {
	         //
	         // null
	         //
	         //verifyException("java.lang.Integer", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test3()  throws Throwable  {
	      // Undeclared exception!
	      try { 
	        sample_program.function("0", "0");
	        fail("Expecting exception: ArithmeticException");
	      
	      } catch(ArithmeticException e) {
	         //
	         // / by zero
	         //
	         //verifyException("sample_program", e);
	      }
	  }

	  @Test(timeout = 4000)
	  public void test4()  throws Throwable  {
	      int int0 = sample_program.function("6", "6");
	      assertEquals(0, int0);
	  }

	  @Test(timeout = 4000)
	  public void test5()  throws Throwable  {
	      int int0 = sample_program.function("1", "1");
	      assertEquals(1, int0);
	  }

	  @Test(timeout = 4000)
	  public void test6()  throws Throwable  {
	      sample_program sample_program0 = new sample_program();
	  }

}
