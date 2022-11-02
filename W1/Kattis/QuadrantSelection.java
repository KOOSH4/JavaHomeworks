package JavaHomeworks.W1.Kattis;

import java.util.Scanner;

public class QuadrantSelection{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("enter X: ");
        int xInput = input.nextInt();
        System.out.println("enter Y: ");
//        int yInput = input.nextInt();
        if( xInput > 0 ){
            if (yInput > 0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if (yInput > 0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}