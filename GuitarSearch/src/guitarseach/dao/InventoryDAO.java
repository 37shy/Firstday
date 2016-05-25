package guitarseach.dao;

import java.util.List;

import guitarsearch.domain.*;

public interface InventoryDAO {

	// 插入guitar 数据
	public abstract boolean addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood);
	
	// 更新guitar 数据
	public abstract boolean updateGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood);
	
	// 删除guitar 数据
	public abstract boolean deleteGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood);
	
	// 取得所有guitar数据
	public abstract List<Guitar> getAllGuitars();
	
	// 根据条件搜索guitar
	public abstract Guitar searchGuitar(Guitar searchGuitar);
}
