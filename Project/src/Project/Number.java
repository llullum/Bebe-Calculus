package Project;

public class Number {
	private String op;
	private int nmax;
	private int nmin;
	private int result;
	private int bound;
	
	//set all the result and calcul relative to the difficulty
	public Number(int i)
	{
		if(i == 0)
		{
			int opi = (int)(Math.random() * ( 3 - 1 ))+1;
			int n1 = (int)(Math.random() * ( 51 - 1 ))+1;
			int n2 = (int)(Math.random() * ( 31 - 1 ))+1;
			if(n1>n2)
			{
				nmax = n1;
				nmin = n2;
			}
			else
			{
				nmax = n2;
				nmin = n1;
			}
			if(opi == 1)
			{
				result = nmax+nmin;
				op = "+";
			}
			else
			{
				result = nmax-nmin;
				op = "-";
			}
			bound = 10;
		}
		else if (i==1)
		{
			int opi = (int)(Math.random() * ( 3 - 1 ))+1;
			int n1 = (int)(Math.random() * ( 51 - 20 ))+20;
			int n2 = (int)(Math.random() * ( 51 - 20 ))+20;
			if(n1>n2)
			{
				nmax = n1;
				nmin = n2;
			}
			else
			{
				nmax = n2;
				nmin = n1;
			}
			if(opi == 1)
			{
				result = nmax+nmin;
				op = "+";
			}
			else
			{
				result = nmax-nmin;
				op = "-";
			}
			bound = 7;
		}
		else
		{
			int opi = (int)(Math.random() * ( 5 - 1 ))+1;
			int n1 = (int)(Math.random() * ( 151 - 50 ))+50;
			int n2 = (int)(Math.random() * ( 151 - 50 ))+50;
			if(n1>n2)
			{
				nmax = n1;
				nmin = n2;
			}
			else
			{
				nmax = n2;
				nmin = n1;
			}
			if(opi == 1)
			{
				result = nmax+nmin;
				op = "+";
			}
			else if(opi == 2)
			{
				result = nmax-nmin;
				op = "-";
			}
			else if (opi == 3)
			{
				if(nmax >= 100)
				{
					nmax = nmax /10;
				}
				if(nmin >= 100)
				{
					nmin = nmin /10;
				}
				result = nmax*nmin;
				op = "*";
			}
			else
			{
				int newn =( n2 % 10)*10;
				while(newn == 0)
				{
					newn = (int)(Math.random() * ( 10 - 1 ))+1;
				}
				result = nmax;
				nmax = nmax * newn;
				nmin = newn;
				op = "/";
			}
			bound = 5;
		}
	}
	public int get_nmax(){return nmax;}
	public int get_nmin(){return nmin;}
	public int get_result(){return result;}
	public int get_bound(){return bound;}
	public String get_op(){return op;}
}
