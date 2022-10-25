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
