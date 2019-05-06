package week1.day1;

public class Armstrong {

	static int n = 370;
	public int amscalculate(int a, int b)
	{
		int sum = 1;
		for(int i=0;i<b;i++)
		{
			sum = sum*a;
		}
			return sum;	
	}
	public int numberOfDigits()
	{
		int temp = n,digit=0;
		while (temp!=0)
		{	
			digit++;
			temp = temp/10;
		}
		//System.out.println("The number of digit is " + digit);
		return digit;
	}
		
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub		
		Armstrong a = new Armstrong();		
		int temp1 =n; 
	int reminder = 0, sum =0;
		
	while (temp1!=0)
	{
		reminder =temp1%10;
		sum = sum + a.amscalculate(reminder, a.numberOfDigits());	
		temp1 = temp1/10;
		}
	if(sum ==n)
	{
		System.out.println("The given number " + n +" is Armstrong ");
	}else 
	{
		System.out.println("The given number " + n +" is not Armstrong ");

	}
}
	
}