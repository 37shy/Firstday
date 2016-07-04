package srs.domain;

import srs.dao.SRSDao;
import srs.dao.UserDao;
import srs.daoImpl.SRSMysqlDaoImpl;
import srs.daoImpl.SRSSqliteDaoImpl;
import srs.daoImpl.UserMysqlDaoImpl;
import srs.daoImpl.UserSqliteDaoImpl;

public class DataAccess {
	
	private static String db = "mysql";

	public static SRSDao createSRSDao() {
		SRSDao obj = null;
		switch (db) {
		case "sqlite":
			obj = new SRSSqliteDaoImpl();
			break;
		case "mysql":    
			obj = new SRSMysqlDaoImpl();
			break;
		}
		return obj;
	}
	
	public static UserDao createUserDao() {
		UserDao obj = null;
		switch (db) {
		case "sqlite":
			obj = new UserSqliteDaoImpl();
			break;
		case "mysql":    
			obj = new UserMysqlDaoImpl();
			break;
		}
		return obj;		
	}
}

