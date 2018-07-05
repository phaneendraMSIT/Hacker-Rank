import java.util.*;

public class Divisionr1 {
	private static int[] divs ;
  public static void main(String[] args) {  
     
    divs = divisors(10000000);
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i =0 ; i<n;i++)
    {
    	int a = sc.nextInt();
    	div(a);
    }
    
   
  }

  private static void div(int a) {
	// TODO Auto-generated method stub
	  int result = 0;  
	  for (int i = 2; i < a; i++) {  
	      if (divs[i] == divs[i+1]) {  
	        result++;  
	      }  
	    }  
	    System.out.println(result);  
	
}

public static int[] divisors(int x) {  
    int[] divs = new int[x + 1];  
    for (int i = 1; i <= x; i++) {  
      for (int j = 1; i * j <= x; j++) {  
        divs[i*j]++;  
      }  
    }  
    return divs;  
  }  
} 