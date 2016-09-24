package chapter_1;

import java.util.Scanner;

public class Repeatition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		String st = Count(str);
		System.out.println(st);
		sc.close();
		
		}
	static String Count(String str)
	{
		String str1 = "";
		int length = str.length();
		int count = 1;
		char first = str.charAt(0);
		for(int i = 1;i<length;i++)
		{
			if(str.charAt(i)==first)
			{
				count++;
			}
			else
			{
				str1 = str1+first+count;
				first = str.charAt(i);
				count = 1;
			}
		}
		str1 = str1+first+count;
		return str1;
	}

}
