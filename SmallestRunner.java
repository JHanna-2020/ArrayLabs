//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SmallestRunner
{
    public static void main( String args[] )
    {     
        RaySmallest rs = new RaySmallest();
        System.out.println(rs.go( new int[]{-99,1,2,3,4,5,6,7,8,9,10,12345} ) );   
        System.out.println(rs.go( new int[]{10,9,8,7,6,5,4,3,2,1,-99} ) ); 

    }
}