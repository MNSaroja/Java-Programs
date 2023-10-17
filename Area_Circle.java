import java.io.*;
class Area_Circle
{
public static void main(String args[])
{
float pi = 3.14f;
int radius;
float area;
radius = Integer.parseInt(args[0]);

area = pi*radius*radius;

System.out.println(area);


}
}
