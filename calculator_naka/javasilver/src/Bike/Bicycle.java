package Bike;

class Bicycle {
    int speed;

    Bicycle(int startSpeed) {
        speed = startSpeed;
    }

    void applyBrake(int decrement) {
        speed -= decrement;
    }

    void speedUp(int increment) {
        speed += increment;
    }
}