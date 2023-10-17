import java.io.*;
import java.util.Scanner;
class Student
{
	String name;
	int rollno;
	int marks[];
	void input(String n, int r, int m[])
	{

		name = n;
		rollno = r;
		marks = new int[5];
		for(int i=0;i<5;i++)
			marks[i] = m[i];

	/*
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name");
		//name = in.nextLine();
		System.out.println("Enter the rollno");
		//rollno = in.nextInt();
		//System.out.println("Enter the marks of 5 subjects");
		//marks = new int[5];
		//for(int i =0;i<5;i++)
			//marks[i] = in.nextInt();*/

	}	
	void output()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no "+rollno);
		System.out.println("Marks are ");
		for(int i=0;i<5;i++)
			System.out.println(marks[i]);
		System.out.println("Total marks "+totalmarks());
		System.out.println("Average marks "+avgmarks()); 

	}

	int totalmarks()
	{
		int sum=0;
		for(int i=0;i<5;i++)
			sum+=marks[i];
		return sum;	

	}
	int avgmarks()
	{
		return totalmarks()/5;	
	}

}
class Stud_Exe
{

	public static void main(String args[])
	{
		Student st = new Student();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name");
		String n = in.nextLine();
		System.out.println("Enter the rollno");
		int r = in.nextInt();
		System.out.println("Enter the marks");
		int[] m = new int[5];
		for(int i=0;i<5;i++)
			m[i] = in.nextInt(); 
		st.input(n,r,m);
		
		st.output();

	}


}










