//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray) {
		for(int i=0; i<ray.length;i++){
			for (int j =i+1; j<ray.length; j++){
				if(ray[i]==ray[j]){
					return true;
				}
			}
		}
		return false;

	}}