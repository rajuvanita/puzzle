
public class BalancedOrNot {
	static boolean balancedOrNot(String exp, int maxR)
	{
	    char cL='<';
	    char cR='>';

	    /*
	        Three cases here.
	        1. originally balanced;
	        2. while scanning through exp, reach unbalanced condition due to cR, e.g. <>><>. Solution, apply maxR;
	        3. when reaching the end exp, still not balanced due to cL, e.g <<<<. No solution.
	    */

	    int nOpening = 0;

	    for(int i=0; i<exp.length(); ++i)
	    {
	        if(cL == exp.charAt(i))
	        {
	            ++nOpening;
	        }
	        else if(cR == exp.charAt(i))
	        {
	            --nOpening;
	            if(nOpening < 0)
	            {
	                if(maxR > 0)
	                {
	                    nOpening=0;
	                    --maxR;
	                }
	                else
	                {
	                    //case 2
	                    return false;
	                }
	            }
	        }
	        else
	        {
	            System.out.println("Error: illegal expression found.");
	            return false;
	        }
	    }

	    //case 1 & 3
	    return 0==nOpening;
	}

	static int[] balancedOrNot(String[] expressions, int[]maxReplacements)
	{
	    for(int i=0; i<expressions.length; ++i)
	    {
	        if(balancedOrNot(expressions[i], maxReplacements[i]))
	        {
	            System.out.println("1");
	        }
	        else
	        {
	            System.out.println("0");
	        }
	    }

	    int[] r = new int[5];
	    return r;
	}
	
	  // Driver method
    public static void main(String[] args) 
    {

       // Scanner in = new Scanner(System.in);

		//String expr = in.nextLine();
    	String[] s = new String[]{"<>>>", "<>>>>"};
		int[] in = new int[]{2,2};
		int[] output =balancedOrNot(s,in); 
        //in.close();
    }

}
