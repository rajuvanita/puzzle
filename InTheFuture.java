import java.util.Scanner;


public class InTheFuture {
	static int minNum(int A, int K, int P)
	{
	    int delta = K-A;

	    if(delta > 0)
	    {
	        return (P+delta)/delta;
	    }

	    return -1;
	}
	
	// Driver code to test above function
	public static void main(String[] args) {
		int a = 4, k=5, p=1;
//		Scanner in = new Scanner(System.in);

//		int N = in.nextInt();
		System.out.println(minNum(a,k,p));
//		in.close();
	}

}
