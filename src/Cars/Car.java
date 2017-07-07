package Cars;

/**
 * Created by Alex on 17-Mar-17.
 */
public class Car {

    String color;
    int maxSpeed;
    int numberOfDoors;
    int maxPassengers;

    public Car(String color, int maxSpeed, int numberOfDoors, int maxPassengers) {

        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numberOfDoors = numberOfDoors;
        this.maxPassengers = maxPassengers;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
}
