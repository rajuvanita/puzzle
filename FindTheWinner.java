import java.util.Scanner;


public class FindTheWinner {
	static String winner(int[] andrea, int[] maria, String s)
	{
	    int offset = 0;
	    if(s.equals("Odd"))
	        offset = 1;

	    int n = andrea.length;
	    int scoreA = 0;
	    int scoreM = 0;

	    for(int i=0; i+offset<n; i=i+2)
	    {
	        int delta = andrea[i+offset] - maria[i+offset];
	        scoreA += delta;
	        scoreM -= delta;
	    }

	    if(scoreA > scoreM)
	        return "Andrea";
	    else if (scoreA < scoreM)
	        return "Maria";
	    else
	        return "Draw";
	}
	
	// Driver code to test above function
	public static void main(String[] args) {
		int a[]=new int[4];//declaration and instantiation.
		a[0]=3;//initialization.
		a[1]=1;
		a[2]=2;
		a[3]=3;
		int b[]=new int[4];//declaration and instantiation.
		b[0]=3;//initialization.
		b[1]=2;
		b[2]=1;
		b[3]=3;
		System.out.println(winner(a,b,"Odd"));
	}

}
