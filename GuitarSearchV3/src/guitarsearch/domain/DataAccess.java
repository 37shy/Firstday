package guitarsearch.domain;

import guitarseach.dao.InventoryDao;
import guitarsearch.daoImpl.InventoryMysqlDaoImpl;
import guitarsearch.daoImpl.InventorySqliteDaoImpl;

public class DataAccess {
		
		private static String db = "sqlite";
	
		public static InventoryDao createInventoryDao() {
			InventoryDao inv = null;
			switch (db) {
			case "sqlite":
				inv = new InventorySqliteDaoImpl();
				break;
			case "mysql":    
				inv = new InventoryMysqlDaoImpl();
				break;
			}
			return inv;
		}	
}
