import java.util.Scanner;

public class Ladder 
{
    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter H:");
        int h = input.nextInt();
        System.out.println("Enter V:");
        int v = input.nextInt();
        
        double deg = ((Math.sin(Math.toRadians(v))));
        double length = (h/deg);
        System.out.println(((int)length)+1); 
        input.close();   
    }
}