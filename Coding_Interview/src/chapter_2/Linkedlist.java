package chapter_2;

public class Linkedlist {
	int data;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	Node head;
	void add(int d)
	{
		Node temp = new Node(d);
		if(head == null)
		{
			head = temp;
		}
		else
		{
			Node current = head;
			if(head!=null)
				{
					while(current.getNext()!=null)
					{
						current = current.getNext();
					}
					current.setNext(temp);
				}
		}		
	}
	class Node{
		Node next;
		int data;
		Node(){
			
		}
		Node(int d)
		{
			this.data = d;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		
		
	}
	boolean delete(int d)
	{
		boolean result = false;
		if(head == null)
		{
			return result;
		}
		if(head.data == d)
		{
			Node tmp = head.next;
			head = tmp;
		}
		Node current = head;
		Node previous = new Node();
		do
		{
			previous = current;
			current = previous.next;
			if(current.data == d)
			{
				current = previous;
				current.next = previous.next.next;
				result = true;
			}
		}while(current.next!=null);
		
		
		return result;
	}
	void print()
	{
		Node current = head;
		do
		{
			System.out.print(current.getData());
			System.out.print(", ");
			current = current.getNext();
		}while(current.next!=null);
		if(current.next == null)
		{
			System.out.print(current.data);
		}
		System.out.println();
	}
	Node fetch(int d)
	{
		
		Node find = new Node();
		if(head.data == d)
			return head;
		else
		{
			Node current = head.next;
			
			do
			{
				if(current.data == d)
				{
					find = current;
					return find;
				}
				else
				{
					find = null;
				}
				current = current.next;
			}while(current.next!=null);
			//return find;
			
		}
		return find;
	}
	int FindData(int index)
	{
		int Data = 0;
		int count = 1;
		if(index == 0)
		{
			return head.data;
		}
		else
		{
			
			Node current = head;
			do
			{
			  current = current.next;
			  count++;
			  if(count == index)
				{
					Data = current.data;
				}
			}while(count<=index);
			
		}
		return Data;
	}
	

}
