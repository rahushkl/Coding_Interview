package chapter_1;

import java.util.Scanner;

public class Replacemenr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String str = sc.nextLine();
		//int length = str.length();
		
		String rep = Replace(str);
		System.out.println(rep);
		sc.close();

	}
	static String Replace(String str)
	{
		String rev = "";
		String[] st = str.split(" ");
		int length = st.length;	
		for(int i = 0;i<length;i++)
		{
			
			if(i == length-1)
			{
				rev = rev+st[i];
			}
			else
			{
				rev = rev+st[i]+"%20";
			}
		}
		
		return rev;
	}

}
