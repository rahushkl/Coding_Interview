package chapter_4;

public class BinaryTree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NodeTree node = new NodeTree();
		node.insert(4);
		node.insert(2);
		node.insert(1);
		node.insert(3);
		node.insert(45);
		node.insert(5);
		node.insert(55);
		node.PrintInorder(node.root);
	    boolean result = node.find(2);
	    if(result)
	    {
		  System.out.println();
		  System.out.println("It is present");
		}
	    System.out.println("Breadth first Traversal:");
	    node.BreadthComplete(node.root);
	    node.delete(2);
	    System.out.println();
	    node.PrintInorder(node.root);
	    node.insert(50);
	    System.out.println();
	    node.PrintInorder(node.root);
	    System.out.println();
	    node.printPreorder(node.root);
	    System.out.println();
	    node.printPostorder(node.root);
	    System.out.println();
	    System.out.println("Breadth first Traversal:");
	    node.BreadthComplete(node.root);
	}

}
