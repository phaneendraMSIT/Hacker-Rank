import java.util.*;

public class Divisors 
{
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	for(int i=0;i<n;i++)
	{
		int m = sc.nextInt();
		
		int a = Count(m);
		System.out.println(a);
	}
}

private static int Count(int m) {
	// TODO Auto-generated method stub
	int count =0;
	for(int i=2;i<m;i++ )
	{
		
		int a = Divisor(i);
		int b = Divisor(i+1);
		if(a == b)
		{
			//System.out.println(i + "a = "+ a+"b = "+b);
			count++;
		}
				
	}
	return count;
}
static int Divisor(int n)
{
    int cnt = 0;
    for (int i = 1; i <= Math.sqrt(n); i++)
    {
         if (n % i == 0)
         {
            // If divisors are equal,
            // count only one
            if (n / i == i)
               cnt++;
  
            else // Otherwise count both
                cnt = cnt + 2;
         }
     }
    return cnt;
}
}
