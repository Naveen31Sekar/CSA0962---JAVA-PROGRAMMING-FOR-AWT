import java.io.*;
import java.util.*;
class circle{
public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter Radius of cirlce: ");
        double r=S.nextFloat();
        double Area=r*r*22/7;
        System.out.println("Area of the Cirlce:  "+Area);
        double Circum=2*22*r/7;
        System.out.println("Circumference of the Cirlce:  "+Circum);
    }
}