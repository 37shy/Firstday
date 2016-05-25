package guitarsearch.domain;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import guitarsearch.daoImpl.InventoryDaoImpl;

public class Initialize {
	public static void main(String[] args) {

	}		
	
	public static boolean creatTable() {
		int i = 0;
		Connection conn = JdbcConn.getJdbcConn();
		try {
			Statement stmt = conn.createStatement();
			String sql =  "CREATE TABLE Inventory " +
	                   "(serialNumber VARCHAR(50) PRIMARY KEY     NOT NULL," +
	                   "builder VARCHAR(50) NOT NULL, " + 
	                   "model VARCHAR(50) NOT NULL, " + 
	                   "type VARCHAR(50) NOT NULL, " + 
	                   "topWood VARCHAR(50) NOT NULL, " +
	                   "backWood VARCHAR(50) NOT NULL, " +
	                   "price Double(6,2) NOT NULL)"; 
			i = stmt.executeUpdate(sql);
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(i);
		return i > 0;
	}
	
	public static void initialTable(InventoryDaoImpl inventory) {

	    inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
		                "Indian Rosewood", "Sitka");
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
		                "Alder", "Alder");
		inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric",
		                "Alder", "Alder");
		inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic",
		                "Mahogany", "Adirondack");
		inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic",
		                "Brazilian Rosewood", "Adriondack");
		inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
		                "Mahogany", "Maple");
		inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue",
		                "electric", "Mahogany", "Mahogany");
		inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic",
		                "Brazilian Rosewood", "Adirondack");
		inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic",
		                "Indian Rosewood", "Cedar");
		inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
		                "Cocobolo", "Cedar");
		inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature",
		                "electric", "Mahogany", "Maple");
	}
}
