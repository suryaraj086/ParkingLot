package parkinglot;

import java.util.HashMap;
import java.util.Map;

public class Cache {

	int token = 1;
	Map<Integer, Floor> floorMap = new HashMap<Integer, Floor>();
	Map<String, Vehicle> vehicleMap = new HashMap<String, Vehicle>();
	Map<Integer, Token> tokenMap = new HashMap<Integer, Token>();

	Cache() {
		for (int i = 1; i < 4; i++) {
			Floor floor = new Floor();
			floorMap.put(i, floor);
		}
	}

	public int tokennumber()
	{
		return ++token;
	}
}
