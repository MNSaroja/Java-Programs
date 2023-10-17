

import java.io.*;
import java.util.Scanner;
class Loop_Ex
{
public static void main(String args[])
{
	int i;
	Scanner a = new Scanner(System.in);
	int n = a.nextInt();
	for(i=0;i<n;i++)
	{
		if(i%5 == 0)
			continue;
		System.out.println(i);
	}
	System.out.println("Loop Completed");
}
}
