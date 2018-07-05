import java.math.BigInteger;
import java.util.*;


public class Large_Sum 
{
	private static BigInteger result;

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int n = Integer.parseInt(s);
		
		result = new BigInteger("0");
		
		for(int i=0;i<n;i++)
		{
			//System.out.println(n);
			BigInteger a = new BigInteger(in.nextLine());
			//System.out.println(a.toString());
			result = result.add(a);
			System.out.println(result.toString());
		}
		
		System.out.println(result.toString().substring(0, 10));
	}
}
