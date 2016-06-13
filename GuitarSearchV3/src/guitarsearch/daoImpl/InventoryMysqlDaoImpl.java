package guitarsearch.daoImpl;

import java.util.List;

import guitarseach.dao.InventoryDao;
import guitarsearch.domain.Guitar;
import guitarsearch.domain.GuitarSpec;

public class InventoryMysqlDaoImpl implements InventoryDao {

	@Override
	public boolean addGuitar(String serialNumber, double price, GuitarSpec spec) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteGuitar(String serialNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateGuitar(Guitar guitar) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Guitar> getAllGuitars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guitar> searchGuitar(GuitarSpec searchGuitar) {
		// TODO Auto-generated method stub
		return null;
	}

}
