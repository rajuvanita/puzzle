import java.util.Scanner;


public class ConsecutiveSum {
	static int countConsecutive(long num)
	{
	    int count = 0;
	    for (long y = 1; y * (y + 1) < 2 * num; ++y)
	    {
	        long x = num - y*(y+1)/2;
	        if (0 == x%(y+1))
	            ++count;
	    }
	    return count;
	}
	
	// Driver code to test above function
	public static void main(String[] args) {
		long n = 15;
		System.out.println(ConsecutiveSum.countConsecutive(n));
	}
}
