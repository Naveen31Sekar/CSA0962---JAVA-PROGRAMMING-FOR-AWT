import java.io.*;
import java.util.*;
class namedetail{
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = S.nextLine();
        System.out.println("Enter your Address: ");
        String address = S.nextLine();
        System.out.println("Enter your City: ");
        String city = S.nextLine();
        System.out.println("Enter your Pincode: ");
        String pincode = S.nextLine();
        System.out.println("Enter your Street: ");
        String street = S.nextLine();System.out.
        println("Enter your Father's Name: ");
        String fathername = S.nextLine();
        System.out.println("Your Name is "+name+"\n\nYour Address is "+address + "\n\n"+city+" is your city, "+ pincode+" is your pincode"+"\n\nYour Street is "+street +"\n\nYour Father's Name is "+fathername );

    }
}