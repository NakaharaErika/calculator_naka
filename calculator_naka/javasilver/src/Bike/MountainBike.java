package Bike;

class MountainBike extends Bicycle {
	int gear;
	
	MountainBike(int startSpeed, int startGear){
		super(startSpeed);
		gear = startGear;
	}
	
	void setGear(int newGear) {
		gear = newGear;
	}
}