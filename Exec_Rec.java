class Rectangle
{

	//properties
	int len;
	int br;

	//method syntax
	//returntype methodname(set_of_arguments)
	//method definition
	void calcArea() 
	{
		int area;
		area = len * br;
		System.out.println("Area value is "+area);
}

void calcPeri()
{
	int peri;
	peri = 2 * (len+br);
	System.out.println(peri);
}

} 
class Exec_Rec
{
	public static void main(String args[])
	{
		//Object creation
		Rectangle obj = new Rectangle();
		//Access the members of the class using dot operator
		obj.len =6;
		obj.br = 7;

		obj.calcArea();  //method calling
		obj.calcPeri();

}

} 

