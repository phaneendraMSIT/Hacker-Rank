import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Balanced_Brackets
{
	public static Stack<Character> stack ;
	 // Complete the isBalanced function below.
    static String isBalanced(String s) {
    	stack = new Stack<Character>();
    	for(int i = 0; i<s.length();i++ )
    	{
    		Character c = s.charAt(i);
    		if(c == '{' || c == '(' || c == '[')
    		{
    			stack.push(c);
    		}
    		if(c == '}' || c == ')' || c == ']')
    		{
    			Character d = (Character) stack.pop();
    			if(stack.isEmpty())
    			{
    				return "NO";
    			}else if(!isMatchingPair(d,c))
    			{
    				return "NO";
    			}else
    			{
    				return "YES";
    			}
    		}
    	}
    	 if (stack.isEmpty())
             return "YES"; /*balanced*/
           else
             {   /*not balanced*/
                 return "NO";
             } 
    }
    
    static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
