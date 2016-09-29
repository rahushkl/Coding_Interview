package chapter_2;

public class LinkedlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist list = new Linkedlist();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		if(list.delete(2))
		{
			list.print();
		}
		if(list.fetch(2)!=null)
		{
			System.out.println("Data entered is present in linkedlist.");
		}
		else
		{
			System.out.println("Data entered is not present in linkedlist.");
		}
		

	}

}
