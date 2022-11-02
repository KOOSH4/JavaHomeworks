import java.util.Scanner;

public class StuckInATimeLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int spellCounter = input.nextInt();
        input.nextLine();
        for(int i = 0; i < spellCounter; i++){
            System.out.print(i+1);
            System.out.println(" Abracadabra");
        }
    }
}