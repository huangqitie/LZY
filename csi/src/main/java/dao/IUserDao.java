package dao;

import pojo.User;

public interface IUserDao {

	User login(String loginname, String password);

	int updateUser(String id, User user);

}
