package guitarseach.dao;

import java.util.List;

import guitarsearch.domain.*;

public interface InventoryDao {

	// 添加guitar
	public abstract boolean addGuitar(String serialNumber, double price, GuitarSpec spec);
	// 删除guitar
	public abstract boolean deleteGuitar(String serialNumber);
	// 更新guitar
	public abstract boolean updateGuitar(Guitar guitar);
	// 取得所有guitar
	public abstract List<Guitar> getAllGuitars();
	// 搜索guitar
	public abstract List<Guitar> searchGuitar(GuitarSpec searchGuitar);
}
