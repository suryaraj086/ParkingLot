package parkinglot;

public class ParkingLot {

	Cache cache = new Cache();

	public String bookSlot(Vehicle vehicle, int floor, String type) throws Exception {
		Floor floorObj = cache.floorMap.get(floor);
		switch (type) {
		case "Car": {
			int compackSize = floorObj.getCompackSize();
			checkSize(compackSize);
			floorObj.setCompackSize(compackSize - 1);
		}
		case "Motorcycle": {
			int motorCycle = floorObj.getMotorCycle();
			checkSize(motorCycle);
			floorObj.setMotorCycle(motorCycle - 1);
		}
		case "Large": {
			int large = floorObj.getLargeSize();
			checkSize(large);
			floorObj.setMotorCycle(large - 1);
		}
		case "Electric": {
			int electricSize = floorObj.getElectricSpot();
			checkSize(electricSize);
			floorObj.setElectricSpot(electricSize - 1);
		}
		case "Handicap": {
			int handicapSize = floorObj.getHandicap();
			checkSize(handicapSize);
			floorObj.setElectricSpot(handicapSize - 1);
		}
		}
		return "Booked SucessFully and token number is " + cache.tokennumber();
	}

	public void checkSize(int size) throws Exception {
		if (size <= 0) {
			throw new Exception("Fully Occupied");
		}
	}

	public String emptySlots(int floor) {
		Floor floorObj = cache.floorMap.get(floor);
		return floorObj.toString();
	}

}
