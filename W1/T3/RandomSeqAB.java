package W1.T3;

import java.util.Random;
import java.util.Scanner;

public class RandomSeqAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Minima:");
		int minima = Input.nextInt();
		
		System.out.println("Enter Maxima:");
		int maxima = Input.nextInt();
		
		System.out.println("Enter Sequence:");
		int sequence = Input.nextInt();
		
		Random rand = new Random();
		for(int i = sequence; i > 0 ; i--) {
			int result = rand.nextInt(maxima - minima) + minima;
			System.out.print("Result: ");
			System.out.println(result);
	}

}
}