package primenumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import primenumber.prime;

public class primeTest 
{

	prime n;
	@Before
	public void init()
	{
		n=new prime();
	}

	@Test
	public void test() 
	{
		assertEquals(false,n.PNC(4));
	}
	@Test
	public void test1() 
	{
		assertEquals(true,n.PNC(5));
	}
}
