package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		String name = "sat";
		int namecount = name.length();
		char[] charArray = name.toCharArray();
		String rev="";
		//for(int i=0;i<namecount;i++)
		//{
			for(int j = namecount-1;j>=0;j-- )
			{			rev=rev+charArray[j];
		
			}
		System.out.println(rev);
		if(name .equals(rev))
		{
			System.out.println("it is palindrome");
		}else
			System.out.println("it is not palindrome");
			

	}

}
