package JavaHomeworks.W1.Kattis;

import java.io.IOException;
import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i < 7) {
            if (input.hasNextInt()) {
                int piece = input.nextInt();
                switch (i) {
                    case 1:
                    case 2:
                        if (piece == 1) {
                            System.out.print(0+ " ");
                        } else {
                            System.out.print(1 - piece + " ");

                        }
                        break;

                    case 3:

                    case 4:

                    case 5:
                        if (piece == 2) {
                            System.out.print(0+ " ");
                        } else {
                            System.out.print(2 - piece + " ");

                        }
                        break;

                    case 6:
                        if (piece == 2) {
                            System.out.print(0 + " ");
                        } else {
                            System.out.print(8 - piece + " ");
                        }
                        break;

                }


            } else {
                input.next();

            }
            i++;
        }
    }
}