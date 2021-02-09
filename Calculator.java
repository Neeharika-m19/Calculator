import java.util.*;
public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		String op=sc.next();
		int n2=sc.nextInt();
		int sum=0;
		if(op.equals("+"))
		{
			sum=n1+n2;
			System.out.print(sum);
		}
		else if(op.equals("-"))
		{
			sum=n1-n2;
			System.out.print(sum);
		}
		else if(op.equals("*"))
		{
			sum=n1*n2;
			System.out.print(sum);
		}
		else if(op.equals("/"))
		{
			if(n2<0)
			{
				System.out.println("divisble by zero error.");
			}
			else
			{
				sum=n1/n2;
				System.out.print(sum);
			}
		}

	}

}
