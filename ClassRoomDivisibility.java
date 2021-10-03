package week1.day1;

public class ClassRoomDivisibility {

	public static void main(String[] args) {

		int num = 21;
		if(num%3 == 0)
		{
			System.out.println("TRIZZZ");
		}
		else if(num%5 == 0)
		{
			System.out.println("FIZZZ");
		}
		else if(num%3==0 && num%5==0)
		{
			System.out.println("Divisible by both 3 and 5");
		}
		else
			System.out.println("Neither divisible by 3 nor 5");
	}

}
