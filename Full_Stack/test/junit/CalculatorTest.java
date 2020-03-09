//CalculatorTest
package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class CalculatorTest {

private static final int timeout = 0;
Calculator c;
	@BeforeClass
	public static void bef() {
		System.out.println("Before any Class");
	}

 	@Before

 	public void before() {
 		System.out.println("Before");
 		this.c = new Calculator();
 	}

 	@Test
 	public void test1() {
 		Calculator c=new Calculator();
 		System.out.println(c.add(3, 3));
 		assertEquals(6,c.add(3,3));
 	}

 	@Test
 	public void testAdd2() {
 		System.out.println(c.add(3, 0));
 		assertEquals(3,c.add(3, 0));
 	}
 	@Ignore
 	@Test
 	
 	public void testAdd3() {
 		System.out.println(c.div(3, 0));
 		assertEquals(3,c.div(3, 0));
 	}
 	@Test

 	public void testAdd4() {
 		System.out.println(c.div(3, 3));
 		assertEquals(1,c.div(3, 3));
 	}
 	/*@Test(timeout=1)
	 * public void testAdd5() {
	 *  while(true) { System.out.println("hi"); } }
	 */
 	@After
 	public void after() {
 		System.out.println("After the test case");
 	}

 	@AfterClass
 	public static void af() {
 		System.out.println("Before any Class");
 	}

}
