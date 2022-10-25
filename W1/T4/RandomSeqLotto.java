/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: RandomSeqLotto
* Link: https://open.kattis.com/problems/carrots
* @author Koosha
* @version 1.0, 10/25/2022
*
* Status : Accepted
* Runtime: 0.102
*/
package W1.T4;

import java.util.Random;

public class RandomSeqLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		for(int i = 6; i > 0 ; i--) {
			int result = rand.nextInt(48)+1;
			System.out.println(result);
	}
	}
}
