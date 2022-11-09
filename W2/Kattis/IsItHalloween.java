package JavaHomeworks.W2.Kattis;


import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String date = input.nextLine();
        if (date.toLowerCase().equals("oct 31") || date.toLowerCase().equals("dec 25") ){
            System.out.println("Yup!");
        }else{
            System.out.println("Nope!");
        }
    }

}
