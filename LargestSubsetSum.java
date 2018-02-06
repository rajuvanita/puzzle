import java.util.Scanner;

public class LargestSubsetSum {
	
	static long maxSubsetSum(int k)
	{
	    long r = 1+k;
	    double sqrtK = Math.sqrt(k) + 1;
	    double upperBound = Math.min(k, sqrtK);
	    for (int i=2; i<upperBound; ++i)
	    {
	        if(0 == (k % i))
	        {
	            if(i*i == k)
	                r += i;
	            else
	                r += i + k/i;
	        }
	    }
	    return r;
	}
	
	static long[] maxSubsetSum(int[] k)
	{
	    int n = k.length;
	    long[] r = new long[n];

	    for(int i=0; i<n; ++i)
	    {
	       
	    r[i] = maxSubsetSum(k[i]);
	    }
	    return r;
	}

	// Driver code to test above function
	public static void main(String[] args) {
		//int n = 4;
		
		//System.out.println(maxSubsetSum(new int[]{2,4}));
		//in.close();
		long[] n = maxSubsetSum(new int[]{2,4});
		for(int i=0;i<n.length;i++){
			System.out.println(i);
		}
	}
}
