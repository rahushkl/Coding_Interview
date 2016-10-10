package chapter_2;

import java.util.Scanner;

public class LinkedlistTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Linkedlist list = new Linkedlist();
		System.out.println("Please enter the data in linkedlist");
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.print();
		System.out.println("Please enter the number you want to delete from list.");
		if(list.delete(sc.nextInt()))
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
		System.out.println(list.FindData(2));
		sc.close();

	}

}
