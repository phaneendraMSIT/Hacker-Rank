import java.util.*;

public class PathSum {
	private static int n;
	private static Scanner sc;
	

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		n = sc.nextInt();
		int a [] [] = new int[n][n];
		for(int i= 0; i< n; i++ )
		{
			for (int j = 0; j < n; j++) 
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(minCost(a));
		
	}


	 private static int minCost(int cost[][])
	    {
	        int i, j;
	        int temp[][]=new int[n+1][n+1];
	 
	        temp[0][0] = cost[0][0];
	 
	        for (i = 1; i <= n; i++)
	            temp[i][0] = temp[i-1][0] + cost[i][0];
	 
	        for (j = 1; j <= n; j++)
	            temp[0][j] = temp[0][j-1] + cost[0][j];
	 
	        for (i = 1; i <= n; i++)
	            for (j = 1; j <= n; j++)
	                temp[i][j] = min(temp[i-1][j-1], 
	                               temp[i-1][j],
	                               temp[i][j-1]) + cost[i][j];
	 
	        return temp[n][n];
	    }


	private static int min(int x, int y, int z) {
		// TODO Auto-generated method stub
		if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
	}
}
