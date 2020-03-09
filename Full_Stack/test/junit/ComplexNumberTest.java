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
public class ComplexNumberTest {
	static Cmplex c1;
	static Cmplex c2;
	
	public ComplexNumberTest(int r1,int img,int r2,int img2) {
		c1 = new Cmplex(r1 ,img);
		c2 = new Cmplex(r2 , img2);
	}
	@Parameterized.Parameters
	public static Collection complex() {
		System.out.println("Inside complex collection");
		return Arrays.asList(new Object[][] {
			{2,5,1,8},{2,5,6,4}	
		});
	}
	@BeforeClass
	public static void bfr() {	
		System.out.println("let's do complex theory: "+c1+"\t"+c2);
	}
	
	@Before
	public void before() {
		System.out.println("checking wheather the no is between  0 - 100 ");
	}
	@Test
	public void Test1() {		
		
	}

}
