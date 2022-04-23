package parkinglot;

import java.util.Scanner;

public class ParkingLotRunner {

	public static void main(String[] args) {
		ParkingLot pObj = new ParkingLot();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the floor number");
		int floorNumber = scan.nextInt();
		System.out.println(pObj.emptySlots(floorNumber));
		System.out.println("Enter the vehicle number");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Vehicle type");
		String type = scan.nextLine();
		System.out.println("Enter the floor");
		int floor = scan.nextInt();
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleNumber(number);
		vehicle.setVehicleType(type);
		try {
			System.out.println(pObj.bookSlot(vehicle, floor, type));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
