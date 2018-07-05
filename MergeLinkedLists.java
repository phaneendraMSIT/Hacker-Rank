import java.util.*;

public class MergeLinkedLists {
	private static LinkedList<Integer> a;
	private static LinkedList<Integer> b;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		a = new LinkedList<>();
		b = new LinkedList<>();
		while(s.hasNextInt())
		{
			a.add(s.nextInt());
		}
		while(s.hasNext())
		{
			b.add(s.nextInt());
		}
		Compare();
	}
	private static void Compare() {
		// TODO Auto-generated method stub
		int i = a.size();
		int j = b.size();
		LinkedList<Integer> c = new LinkedList<>();
		while(i != 0 && j != 0)
		{
			
		}
		
	}

}
