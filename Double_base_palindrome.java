import java.util.*;


public class Double_base_palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int sum =0;
		for(int i=1;i<n;i++)
		{
			Boolean s = convert(a,i);
			if(s == true)
			{
				System.out.println(i);
				sum +=i;
			}
		}
		System.out.println(sum);
	}

	private static Boolean convert(int base, int inputNum) {
		// TODO Auto-generated method stub
		String num ="";
		 while (inputNum > 0)
		    {
		        num += reVal(inputNum % base);
		        inputNum /= base;
		    }
		 
		 int n = Integer.parseInt(num);
		 String a = new StringBuilder(num).reverse().toString();
		 int m = Integer.parseInt(a);
		 if(n == m)
		 {
			 return true;
		 }
		 else
		 {
			 return false;			 
		 }
		
	}

	

	private static char reVal(int num) {
		// TODO Auto-generated method stub
		 if (num >= 0 && num <= 9)
		        return (char)(num + '0');
		    else
		        return (char)(num - 10 + 'A');
	}

}
