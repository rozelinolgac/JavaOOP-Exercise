package Classes;

public class Car {   // Burada public yazılmasa da olur
    String type="Sedan";
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increment) {
        if (speed < speedLimit) {
            speed += increment;
        }

        if (speed > speedLimit) {
            speed = 180;
        }

    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        if (speed < 0) {
            speed = 0;
        }
    }

    void printSpeed() {
        System.out.println("Hızınız : " + speed);
    }


}