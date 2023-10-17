import java.io.*;
class Add_Two
{
//command-line arguments 
public static void main(String[] args)
{

	int a,b;
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	//float d = Float.parseFloat(args[2]);
	int c = a+b;
	System.out.println(args[0]+args[1]);
	System.out.println("The sum of 2 numbers is "+c);
}
}
