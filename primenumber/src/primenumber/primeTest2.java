package primenumber;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class primeTest2 
{
	private int input;
	private Boolean output;
	private prime age;
	public primeTest2(int input,Boolean output)
	{
		this.input=input;
		this.output=output;
	}
@Before
public void init()
{
	age=new prime();
}
@Parameterized.Parameters
public static Collection aget()
{
	return Arrays.asList(new Object[][]{
			{3,true},
			{20,false}}
			);
	
}
@Test
public void addtest()
{
	assertEquals(output,age.PNC(input));
}
}
