package junit;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NumberGenTest {
	
	private NumberGen no;
	private int randNo;
	static NumberGen n = new NumberGen();
	static int a=+n.getRand(00);
	static int b=+n.getRand(00);
	static int c=+n.getRand(00);
	public NumberGenTest(int randNo) {
		this.randNo = randNo;
		System.out.println("Inside constructor: " + this.randNo);
	}
	
	@Parameterized.Parameters
	public static Collection no() {
		
		System.out.println("Inside Random collection");
		return Arrays.asList(new Object[][] {
			{a},{b},{c}
			});
	}
	@BeforeClass
	public static void bfr() {	
		System.out.println("Random no. generated: "+a+"\t"+b+"\t"+c);
	}
	
	@Before
	public void before() {
		System.out.println("checking wheather the no is between  0 - 100 ");
	}
	@Test
	public void Test1() {		
		assertTrue(n.getRand(randNo)<100);
		System.out.println("true");
	}
}
