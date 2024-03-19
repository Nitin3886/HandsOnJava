// Java program to add two binary strings

public class AddTwoBinary {

	// Function to add two binary strings
	static String add_Binary(String x, String y)
	{

		int num1 = Integer.parseInt(x, 2);
		// converting binary string into integer(decimal
		// number)

		int num2 = Integer.parseInt(y, 2);
		// converting binary string into integer(decimal
		// number)

		int sum = num1 + num2;
		// Adding those two decimal numbers and storing in
		// sum

		String result = Integer.toBinaryString(sum);
		// Converting that resultant decimal into binary
		// string

		return result;
	}

	// Main driver method
	public static void main(String args[])
	{
		String x = "011011", y = "1010111";

		System.out.print(add_Binary(x, y));
	}
}
