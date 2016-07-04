package srs.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import srs.dao.UserDao;
import srs.domain.DBUtil;
import srs.domain.DataAccess;
import srs.domain.Person;
import srs.domain.Type;

public class UserMysqlDaoImpl implements UserDao {

	@Override
	public boolean addUser(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Person> getAllUser() {
		ArrayList<Person> persons = new ArrayList<Person>();
		Connection conn = DBUtil.getMySqlConn();
		String sql = "Select * from srsuser";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String accountNo = rs.getString("accountNo");
				String pwd = rs.getString("pwd");
				Type type = Type.exchangeType(rs.getString("type"));
				String name = rs.getString("name");
				String ssn = rs.getString("ssn");
				Person person = new Person(name, ssn, accountNo, pwd, type);
				persons.add(person);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return persons;
	}

	@Override
	public boolean verifyLoginUser(Person loginUser) {
		ArrayList<Person> persons = new ArrayList<Person>();
		UserDao userDao = DataAccess.createUserDao();
		persons = userDao.getAllUser();
		if(persons != null) {
			for(Person p: persons) {
				if(p.getAccountNo().equals(loginUser.getAccountNo()) 
					&& p.getPwd().equals(loginUser.getPwd())
					&& p.getType().equals(loginUser.getType())){
					return true;
				}
			}
		}
		return false;
	}
	
	
}
