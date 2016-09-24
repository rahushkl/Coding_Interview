package chapter_1;

import java.util.Scanner;

public class NullString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String str = sc.nextLine();
		if(str.length()>0)
		{
			String rev = Reverse(str);
			System.out.println("The reverse of "+str+" is: "+rev);
		}
		else
		{
			System.out.println("Please enter a valid string.");
		}
		sc.close();

	}
	static String Reverse(String str)
	{
		String rev = "";
		int length = str.length();
		for(int i = length-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		
		return rev;
	}

}
