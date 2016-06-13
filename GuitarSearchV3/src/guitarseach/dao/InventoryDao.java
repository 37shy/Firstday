package guitarseach.dao;

import java.util.List;

import guitarsearch.domain.*;

public interface InventoryDao {

	// ���guitar
	public abstract boolean addGuitar(String serialNumber, double price, GuitarSpec spec);
	// ɾ��guitar
	public abstract boolean deleteGuitar(String serialNumber);
	// ����guitar
	public abstract boolean updateGuitar(Guitar guitar);
	// ȡ������guitar
	public abstract List<Guitar> getAllGuitars();
	// ����guitar
	public abstract List<Guitar> searchGuitar(GuitarSpec searchGuitar);
}
