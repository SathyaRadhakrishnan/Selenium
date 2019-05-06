package week1.day1;

public class ArrayCars {

	public void cars()
	{
		String [] cartype = {"Audi", "Bens", "BMW", "Hondai"};
		for (int i=0; i<5;i++)
		{
			System.out.println(cartype[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayCars ac = new ArrayCars();
		ac.cars();
	}

}
