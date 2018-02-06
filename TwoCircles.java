import java.util.Scanner;

public class TwoCircles {
	
	static String[] circles(String[] info)
	{

	    int n = info.length;
	    String[] r = new String[n];

	    for(int i=0; i<n; ++i)
	    {
	        String[] parts = info[i].split(" ");
	        if(6 != parts.length)
	        {
	            System.out.println("Error: expected 6 numbers in each input line.");
	        }
	        int cA=0,rA=0,cB=0,rB=0;
	        try
	        {
	            cA = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
	            rA = Integer.parseInt(parts[2]);
	            cB = Integer.parseInt(parts[3]) + Integer.parseInt(parts[4]);
	            rB = Integer.parseInt(parts[5]);
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println("Error: NumberFormatException happened in parts.");
	            return r;
	        }

	        //center distance
	        int deltaC = Math.abs(cA-cB);
	        int sumR = rA + rB;
	        int deltaR = Math.abs(rA-rB);



	        if(0 == deltaC)
	        {
	            r[i] = "Concentric";
	        }

	        else if(sumR < deltaC)
	        {
	            r[i] = "Disjoint-Outside";
	        }

	        else if(deltaC == sumR || deltaC == deltaR)
	        {
	            r[i] = "Touching";
	        }

	        else if(deltaC < sumR && deltaC > deltaR)
	        {
	            r[i] = "Intersecting";
	        }

	        else
	        {
	            r[i] = "Disjoint-Inside";
	        }


	    }
	    return r;
	}
	
	// Driver code to test above function
	public static void main(String[] args) {
//		String[] s = new String[5];
//		s[0]="12 0 21 14 0 23";
//		s[1]="0 45 8 0 94 9";
//		s[2]="35 0 13 10 0 38";
//		s[3]="0 26 8 0 9 25";
		
		String[] s = circles(new String[]{"0 5 9 0 9 7","0 15 11 0 20 16","26 0 10 39 0 23","37 0 5 30 0 11","41 0 0 28 0 13"});
	//	System.out.println(circles(new String[]{"0 5 9 0 9 7","0 15 11 0 20 16","26 0 10 39 0 23  ","37 0 5 30 0 11","41 0 0 28 0 13"}));
		for(int i=0;i<s.length;i++){
			System.out.println(i);
		}
		//in.close();
	}


}
