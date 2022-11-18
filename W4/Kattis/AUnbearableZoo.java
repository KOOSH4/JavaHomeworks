package JavaHomeworks.W4.Kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class AUnbearableZoo {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> allZooIndexes = new ArrayList<>();
        ArrayList<ArrayList<String>> allAnimals = new ArrayList<>();


        Scanner scan = new Scanner(System.in);
        int round = 1;
        int list=0;
        do {
            ArrayList<String> Animals = new ArrayList<>();
            ArrayList<Integer> zooIndex = new ArrayList<>();
            System.out.println("How many animals are in this cage?");
            list = scan.nextInt();
            scan.nextLine();
            if(list == 0){
                break;
            }
            for (int i = 0; i<list; i++) {
                System.out.println((i+1) + "Animal's Name?");
                String kind = scan.nextLine().toLowerCase();
                String[] splitName = kind.split(" ");
                if(!Animals.contains(splitName[splitName.length-1])){
                    Animals.add(splitName[splitName.length-1]);
                    Collections.sort(Animals);
                    int animalIndex = Animals.indexOf(splitName[splitName.length-1]);
                    zooIndex.add(animalIndex, 1);
                }else{
                    int animalIndex = Animals.indexOf(splitName[splitName.length-1]);
                    int temp = zooIndex.get(animalIndex);
                    zooIndex.set(animalIndex, temp+1);
                }
            }

            allZooIndexes.add(zooIndex);
            allAnimals.add(Animals);
            list--;
         }while(list != 0);
        for(int p = 0;  p < allZooIndexes.size(); p++){
            System.out.println("list "+ round + ":");
            int loop = allZooIndexes.get(p).size();
            for (int k = 0; k < loop; k++){
                    System.out.println(allAnimals.get(p).get(k) + " | " + allZooIndexes.get(p).get(k));
            }
            round++;
        }
        }
    }

