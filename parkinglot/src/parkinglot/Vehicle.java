package parkinglot;

public class Vehicle {
	String vehicleType = "";
	int vehicleNumber;
	int tokenNumber;
	boolean payment = false;

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

}
