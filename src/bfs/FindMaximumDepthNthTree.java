package bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class FindMaximumDepthNthTree {
	
	public static void main(String args[])
	{
//		int input[]= {1,2,3,4,5};
//		for (int i = 0; i < input.length; i++) {
			Node one=new Node(1);
			Node two=new Node(2);
			Node three=new Node(3);
			Node four=new Node(4);
			Node five=new Node(5);
			Node six=new Node(6);
			one.children.add(two);
			one.children.add(three);
			two.children.add(four);
			two.children.add(six);
			
			System.out.println(execute(one));
//		}
		
	}

	private static int execute(Node node) {
	       
		int depth = 0;
		     
		if(node == null) 
		 return 0;
		 
		 Queue<Node> queue = new LinkedList<>();
		 queue.add(node);
		 
		 while(!queue.isEmpty())
		 {
		     int size = queue.size();
		     
		     for(int i = 0; i < size; i++)
		     {
		         Node current = queue.poll();
		         
		         for(Node child: current.children) 
		        	 queue.add(child);
		     }
		     
		     depth++;
		  }
		 
		 return depth;
		 }
}
	

//Definition for a Node.
class Node {
	
public int val;

public List<Node> children=new ArrayList<>();

public Node() {}

public Node(int _val) {
   val = _val;
}


};
