//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
    public static int go(int[] ray)
    {
        for(int i=0; i<ray.length;i++){
            for (int j =i+1; j<ray.length; j++){
                if(ray[j]>ray[i]){
                    return ray[i]; 
                    
                }
                else{
                    return ray[j];
                }
            }
        }
        return 0;
        
    }
}