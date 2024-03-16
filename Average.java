// Java program to accept two number from the user and calculate the average.

import java.util.*;
public class Average {
	public static void main(String args[])
	{
	double a,b,sum=0,avg=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First No:");
		a=scan.nextDouble();
		System.out.println("Enter the Second No:")
		b=scan.nextDouble();
		sum=a+b;
		avg=sum/2;
		System.out.println("Average="+avg);
	}
}
