package JavaHomeworks.W2.Kattis;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        if(in.contains("ss")){
            System.out.println("hiss");
        }else{
            System.out.println("no hiss");

        }
    }
}
