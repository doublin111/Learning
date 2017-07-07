package Cars;

/**
 * Created by Alex on 05-Jul-17.
 */
public class Testing {

    public static void main(String[] args) {

        Dacia daciaOne = new Dacia("Yellow", 160, 4, 5);

        System.out.println("The first Dacia is " + daciaOne.color + " colored, has " + daciaOne.numberOfDoors + " doors, can hold up to " + daciaOne.maxPassengers + " passengers and a maximum speed of " + daciaOne.maxSpeed);
    }
}
