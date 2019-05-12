package practice;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "MASMASMASTP";
		int match = 0,count =0,n = 0;
		char[] ch = name.toCharArray();
		n = name.length();
		char [] dup = new char[n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(ch[i]==ch[j])
					match++;				
			}
			if(match==1)
			{
				 dup[count++] = ch[i];
			}
			 match =0;
		}
		System.out.println(dup);		
		System.out.println(n);
			}

}
