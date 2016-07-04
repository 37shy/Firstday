package srs.dao;

import java.util.ArrayList;

import srs.domain.Person;

public interface UserDao {
	public abstract boolean addUser(Person p);
	public abstract boolean updateUser(Person p);
	public abstract boolean deleteUser(Person p);
	public abstract ArrayList<Person> getAllUser();
	public abstract boolean verifyLoginUser(Person p);
}
