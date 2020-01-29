package primenumber;

public class prime 
{
	public boolean PNC(int num)
	{
		int c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c<3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
