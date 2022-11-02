import java.util.Scanner;
public class coldputerScience {

    // Instantiate the Scanner
    private static Scanner reader;

    public static void main(String[] args){

        // Set the scanner to take in input
        reader = new Scanner(System.in);

        int temps = reader.nextInt();
        int negatives = 0;

        for(int i=0; i< temps;i++){
            int temp = reader.nextInt();
            if(temp < 0){
                negatives++;
            }
        }
        System.out.println(negatives);
    }
}