package chapter_4;

public class NodeTree {
	Node root;
	public NodeTree()
	{
		this.root = null;
	}
	
	Node Search(int d, Node root)
	{
		while(root!=null)
		{
			int value = root.getData();
			if(value == d)
			{
				break;
			}
			if(value<d)
			{
				root = root.getRight();
			}
			if(value>d)
			{
				root = root.getLeft();
			}
		}
		return root;
	}
	void insert(int d)
	{
		Node node = new Node(d);
		if(root == null)
		{
			root = node;
			return;
		}
		Node current = root;
		Node parent = null;
		while(true){
			parent = current;
			if(d<current.data){				
				current = current.left;
				if(current==null){
					parent.left = node;
					return;
				}
			}else{
				current = current.right;
				if(current==null){
					parent.right = node;
					return;
				}
			}
		}

	}
	public void PrintInorder(Node node)
	{
		
		if(node!=null)
		{
			PrintInorder(node.left);
			System.out.print(node.data+" ");
			PrintInorder(node.right);
		}
	}
	void printPreorder(Node node)
    {
        if (node == null)
        {
        	return;
        }
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
	void printPostorder(Node node)
    {
        if (node == null)
        {
        	return;
        }
        printPreorder(node.left);
        printPreorder(node.right);
        System.out.print(node.data + " ");
    }
	int CompleteBreadth(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		else
		{
			int leftheight = CompleteBreadth(node.left);
			int rightheight = CompleteBreadth(node.right);
			if(leftheight>rightheight)
			{
				return (leftheight+1);
			}
			else
			{
				return (rightheight+1);
			}
		}
		
		
	}
	void BreadthComplete(Node node)
	{
		int height = CompleteBreadth(node);
		for(int i =1;i<=height;i++)
		{
			BreadthFirstOrder(node, i);
		}
	}
	void BreadthFirstOrder(Node node, int level)
	{
		if(node == null)
		{
			return;
		}
		if(level ==1)
		{
			System.out.print(node.data + " ");
		}
		else if (level > 1)
		{
			BreadthFirstOrder(node.right, level-1);
			BreadthFirstOrder(node.left, level-1);
		}
	}
	boolean find(int d)
	{
		Node current = root;
		while(current!=null)
		{
			if(current.data==d)
			{
				return true;
			}
			else if(current.data>d)
			{
				current = current.left;
			}
			else
			{
				current = current.right;
			}
		}
		return false;
		
	}
	boolean delete(int d)
	{
		Node current = root;
		Node previous = root;
		boolean leftChild = false;
		while(current.data!=d)
		{
			previous = current;
			if(current.data>d)
			{
				current = current.left;
				leftChild = true;
			}
			else
			{
				leftChild = false;
				current = current.right;
			}
			if(current ==null)
			{
				return false;
			}
		}
		if((current.left==null)&&(current.right==null))
		{
			if(current == root)
			{
				root = null;
			}
			else
			{
				if(leftChild == true)
				{
					previous.left = null;
				}
				else
				{
					previous.right = null;
				}
			}
		}
		else if((current.left!=null)&&(current.right==null))
		{
			if(current == root)
			{
				root= current.left;
			}
			else if(leftChild)
			{
				previous.left = current.left;
			}
			else
			{
				previous.right = current.left;
			}
		}
		else if((current.left==null)&&(current.right!=null))
		{
			if(current == root)
			{
				root= current.right;
			}
			else if(leftChild)
			{
				previous.left = current.right;
			}
			else
			{
				previous.right = current.right;
			}
		}
		else
		{
			Node minimum = getNext(current);
			if(current == root)
			{
				root = minimum;
			}
			else if(leftChild)
			{
				previous.left = minimum;
			}
			else
			{
				previous.right = minimum;
			}
			minimum.left = current.left;
		}
		return true;
	}
	Node getNext(Node node)
	{
		Node next = null;
		Node present = null;
		Node current = node.right;
		while(current!=null)
		{
			present = next;
			next = current;
			current = current.left;
		}
		if(next!= node.right)
		{
			present.left = next.right;
			next.right = node.right;
		}
		return next;
	}

	
	
	
}

