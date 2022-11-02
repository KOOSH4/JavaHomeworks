
import java.util.Scanner;

public class coldputerScience {
    static public void main(String[] arg){
        Scanner input = new Scanner(System.in);
        int minusCounter = 0;
        int   dayCount;
        int j=0;
        do{
            System.out.print("How many Days? ");
            dayCount = input.nextInt();
        }while(dayCount<=0 || dayCount > 100 );
        int  amountOfInputs = dayCount;
        int temp[] = new int[amountOfInputs];

        System.out.println("please enter the Temperatur!");
        do{
            int
        }
        for(int i = 0 ; i < amountOfInputs ; i++) {
            int days = i+1;
            System.out.print("day "+ days+" :");
            temp[i] = input.nextInt();
            if(temp[i]<0) {
                minusCounter++;
            }
        }
        System.out.print("Minus Days:");
        System.out.println(minusCounter);

    }
}
