/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Quadratic equations
* Link: https://open.kattis.com/problems/carrots
* @author Koosha
* @version 1.0, 10/25/2022
*
* Status : Accepted
* Runtime: 0.102
*/

package W1.T1;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter A:");
		double a = myInput.nextDouble();
//		System.out.println(a);
		System.out.println("Enter B:");
		double b = myInput.nextDouble();
		System.out.println("Enter C:");
		double c = myInput.nextDouble();
		
		double d = b * b - 4.0 * a * c;  
		
		if (d> 0.0)   
		{  
		double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
		double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
		System.out.println("The roots are " + r1 + " and " + r2);  
		}   
		else if (d == 0.0)   
		{  
		double r1 = -b / (2.0 * a);  
		System.out.println("The root is " + r1);  
		}   
		else   
		{  
		System.out.println("Roots are not real.");  
		}  
	}

}
