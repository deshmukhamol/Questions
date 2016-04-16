package org.twister.questions;

/**
 * Class with nice questions
 *
 */
public class PowerOfTwo 
{
	public static boolean isPowerOf2(int n){
		boolean isPowerOf2 = false;
		if((n & (n-1)) == 0)
			isPowerOf2 = true;
		
	return isPowerOf2;
	}
	
	
	public static void main( String[] args )
    {
    	boolean result = isPowerOf2(8);
    	System.out.println(" Power of 2 "+ result);
    }
}
