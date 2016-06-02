package guitarseach.dao;

import java.util.List;

import guitarsearch.domain.*;

public interface InventoryDAO {

	
	public abstract boolean addGuitar(String serialNumber, double price, String builder, String model, int numStrnigs, String type, String backWood, String topWood);

	public abstract List<Guitar> getAllGuitars();
	
	public abstract List<Guitar> searchGuitar(GuitarSpec searchGuitar);
}
