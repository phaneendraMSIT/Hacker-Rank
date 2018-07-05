import java.util.*;


public class Triangle_numbers {
	private static int no = 0;
	//private static ArrayList<Integer> al;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//al = new ArrayList<>();
		for(int i=0; i<n;i++)
		{
			int a = sc.nextInt();
			
			if(isTriangular(a))
			{
				
				System.out.println(a);
			}
			else
			{
				System.out.println(-1);
			}
			
		}
	}
	
	static boolean isTriangular(int num)
    {
		
		     int calc_num = 8*num+1;
		     int t =  (int)Math.sqrt(calc_num);
		     if (t*t==calc_num) {
		    	 no = t/2;
		        return true;
		     }
		     return false;
    }

}
