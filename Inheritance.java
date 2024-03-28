// Java Program to illustrate Inheritance (concise)

import java.io.*;
class Employee {
	int salary = 60000;
}
class Engineer extends Employee {
	int benefits = 10000;
}
class Inheritance
{
	public static void main(String args[])
	{
		Engineer E1 = new Engineer();
		System.out.println("Salary : " + E1.salary + "\nBenefits : " + E1.benefits);
	}
}


//OUTPUT:
//Salary : 60000
//Benefits : 10000

