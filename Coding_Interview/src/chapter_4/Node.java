package chapter_4;

public class Node {
	Node left;
	Node right;
	int data;
	
	public Node(int d)
	{
		this.left = null;
		this.right = null;
		this.data = d;
		
	}
	
	Node getLeft()
	{
		return left;
	}
	Node getRight()
	{
		return right;
	}
	int getData()
	{
		return data;
	}

}
