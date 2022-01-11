//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayTotal
{
	public static int go(int[] ray)
	{
		/*
		* make global total int var
		* for each value inside the ray array, add and assign to total
		* return total variable outside of loop
		*/
		int total=0;
		for(int number: ray){
			 total+=number;
		}
		return total;


	}
}