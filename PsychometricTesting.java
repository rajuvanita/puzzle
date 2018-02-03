import java.util.Scanner;

public class PsychometricTesting {
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits)
	{
	    int limitsSize = lowerLimits.length;
	    int[] r = new int [limitsSize];

	    for(int i=0; i<limitsSize; ++i)
	    {
	        int count=0;

	        for(int j=0; j<scores.length; ++j)
	        {
	            if(scores[j]>=lowerLimits[i] && scores[j]<=upperLimits[i])
	                ++count;
	        }

	        r[i]=count;
	    }
	    return r;
	}

	// Driver code to test above function
	public static void main(String[] args) {
		int[] n = jobOffers(new int[]{5,1,3},new int[]{7,2,2},new int[]{2,8,4});
		//int[] n = jobOffers(new int[]{1, 3, 5, 6, 8},new int[]{2},new int[]{6});
		for(int i=0;i<n.length;i++){
			System.out.println(i);
		}
		//System.out.println(jobOffers(new int[]{5,1,3},new int[]{7,2,2},new int[]{2,8,4}));
	}
}
