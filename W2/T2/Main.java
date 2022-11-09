package JavaHomeworks.W2.T2;

public class Main
{
    public static void main(String[] args){
        // Declare and create a Bike object and one mountainBike objects.
        MountainBike bikeOne = new MountainBike(10, 20,
        6, 2);

        System.out.println(
                bikeOne.seatHeight + " - " + bikeOne.cadence + " - " + bikeOne.speed + " - " + bikeOne.gear
        );
        bikeOne.setHeight(15);
        bikeOne.setCadence(15);
        bikeOne.applyBrake(5);
        bikeOne.speedUp(30);
        bikeOne.setGear(4);

        System.out.println(
                bikeOne.seatHeight + " - " + bikeOne.cadence + " - " + bikeOne.speed + " - " + bikeOne.gear
        );
}}
