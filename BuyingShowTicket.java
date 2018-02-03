
public class BuyingShowTicket {
	static long waitingTime(int[] tickets, int p)
	{
	    /*
	        iterate through tickets till tickets[p] becomes 0
	    */
	    if(p >= tickets.length)
	    {
	        System.out.println("Error: p is bigger than tickets length.");
	        return -1;
	    }

	    int count = 0;
	    int iterator = 0;
	    while(tickets[p] > 0)
	    {
	        if(tickets[iterator] > 0)
	        {
	            --tickets[iterator];
	            ++count;
	        }
	        iterator = (iterator+1) % tickets.length;
	    }
	    return count;
	}

	public static void main(String[] args) {
		System.out.println(waitingTime(new int[10],5));
	}
}
