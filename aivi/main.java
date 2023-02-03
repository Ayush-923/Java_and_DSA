//SOLUTION-3
import java.io.*;
import java.util.Scanner;

class Main {
	static double Series(double x, int n)
	{
		double sum = 1, term = 1, fct = 1;
		double p = 1, multi = 1;
		
		// Computing sum of remaining
		// n-1 terms.
		for (int i = 1; i < n; i++)
		{
			fct = fct * multi * (multi + 1);
			p = p * x * x;
			term = (-1) * term;	
			multi += 2;
			sum = sum + (term * p) / fct;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
		System.out.printf("%.2f", Series(x, n));
	}
}










