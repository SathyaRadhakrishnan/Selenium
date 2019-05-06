package week1.day1;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] name = {"sathya","kamal","shalni","udhaya","saranya","ramya"};
		int length = name.length;
		System.out.println("Name starts with s is displayed as below:");
		for(int i=0;i<length;i++)
		{
			char[] charArray = name[i].toCharArray();
			if(charArray[0]=='s')
			{
				System.out.println(name[i]);
			}
		}

}
}
