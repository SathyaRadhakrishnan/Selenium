package practice;

import org.testng.annotations.Test;

public class Stringswap {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	@Test
	public void methodOne()
	{
		String str = new String("Sathya");
		String str1 = new String("SathyaR");
		String temp = new String();
		temp = str;
		str = str1;
		str1 = temp;
		System.out.println(str);
		}
	
	@Test
	public void methodTwo()
	{
		String str = "Sathya";
		String str1 = "SathyaR";
		String temp = "";
		temp = str;
		str = str1;
		str1 = temp;
		System.out.println(str);
		
	}
		//both the above methods are working

	//}

}
