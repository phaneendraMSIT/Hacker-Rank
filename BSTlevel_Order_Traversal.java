import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class BSTlevel_Order_Traversal 
{
	private static Scanner sc;



	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while(T --> 0)
		{
			int data = sc.nextInt();
			root = insert(root, data);
		}
		
		levelOrder(root);
	}
	
private static void levelOrder(Node root) {
		// TODO Auto-generated method stub
		levelOrder(root,0);
	}

     
 
private static void levelOrder(Node root, int space) {
	// TODO Auto-generated method stub
	 // Base case
	if(root == null)
	{
		
	}
   String s = "";
   s.concat(String.valueOf(root.left.data));
   s.concat(String.valueOf(root.right.data));
}

public static Node insert(Node root,int data){
    if(root==null){
        return new Node(data);
    }
    else{
        Node cur;
        if(data<=root.data){
            cur=insert(root.left,data);
            root.left=cur;
        }
        else{
            cur=insert(root.right,data);
            root.right=cur;
        }
        return root;
    }
    
}
}







