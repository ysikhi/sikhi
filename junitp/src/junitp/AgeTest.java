package junitp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AgeTest 
{
	private int input;
	private String output;
	private Age age;
	public AgeTest(int input,String output)
	{
		this.input=input;
		this.output=output;
	}
@Before
public void init()
{
	age=new Age();
}
@Parameterized.Parameters
public static Collection aget()
{
	return Arrays.asList(new Object[][]{
			{14,"not eligible to vote"},
			{20,"eligible to vote"}}
			);
	
}
@Test
public void addtest()
{
	assertEquals(output,age.election(input));
}
}
