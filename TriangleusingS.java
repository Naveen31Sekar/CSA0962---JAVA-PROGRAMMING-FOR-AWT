import java.io.*;
import java.util.*;
import java.lang.Math.*;
class TriangleusingS{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Side A of Triangle: \t");
        double A = s.nextInt();
        System.out.println("Enter Side B of Triangle: \t");
        double B = s.nextInt();
        System.out.println("Enter Side C of Triangle: \t");
        double C = s.nextInt();
        double S = (A+C+C)/2;
        System.out.println("Semi Perimeter of Triangle: \t"+S);
        double Pre = (S*(S-A)*(S-B)*(S-C));
        double Area = Math.sqrt(Pre);
        System.out.println("Area of Triangle: \t"+ Area);
    }
}