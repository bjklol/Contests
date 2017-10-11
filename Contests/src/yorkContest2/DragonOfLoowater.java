package yorkContest2;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class DragonOfLoowater
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintStream out = System.out;
		
	//	out.println("give the amount of dragon heads and knights");
		
		while(true)
		{
		int heads = in.nextInt(); 

		int knights = in.nextInt(); 
		
		if (heads > 20000 || knights > 20000) throw new Exception("");
		

		if(heads == 0 && knights == 0)
		{
			break;
		}
		int knightCen[] = new int[knights];
		int headCen[] = new int[heads];
		
			for(int i = 0; heads > 0 && i < headCen.length; i++, heads--)
			{
				int temp = in.nextInt();
				if(temp > 10000 || temp < 0) throw new Exception();
				headCen[i] = temp;
			}
			
			for(int i = 0; knights > 0 && i < knightCen.length; i++,knights--)
			{
				int temp = in.nextInt();
				if(temp > 10000 || temp < 0) throw new Exception();
				knightCen[i] = temp;
			}

			Arrays.sort(knightCen);
			Arrays.sort(headCen);

			
		//	knightCen[0] vs headCen[0]
			int dragon = 0;
			int men = 0;
			int goldTotal = 0;
			while(dragon < headCen.length && men < knightCen.length)
			{
				if(knightCen[men] >= headCen[dragon])
				{
					dragon++;
					goldTotal += knightCen[men];
					men++;
				}
				else
				{
					men++;
				}
			}
			if(men == knightCen.length && dragon < headCen.length)
			{
				out.println("Loowater is doomed!");
			}
			else
			{
				out.println(goldTotal);
			}
		}
	}

}
