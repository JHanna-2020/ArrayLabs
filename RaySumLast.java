//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int total=0;
		for(int num: ray){
			if(num>ray[ray.length-1]){
				total+=num;
			}

		}
		if(total==0){
			return -1;

		}
		return total;
	}
}