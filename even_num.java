import java.io.*;
import java.util.Scanner;

class even_num
{
public static void main(String args[])
{
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n = input.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum = sum + i;
		System.out.println(sum);
	}
	//System.out.println(sum);

}

}
