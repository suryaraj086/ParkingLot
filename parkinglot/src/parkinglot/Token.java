package parkinglot;

public class Token {
	int tokenNumber = 1;
	String entryTime;
	String exitTime;

	public int getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getExitTime() {
		return exitTime;
	}

	public void setExitTime(String exitTime) {
		this.exitTime = exitTime;
	}

}
