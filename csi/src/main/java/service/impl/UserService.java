package service.impl;

import dao.IUserDao;
import dao.impl.UserDao;
import pojo.User;
import service.IUserService;

public class UserService implements IUserService{
	private IUserDao dao = new UserDao();
	@Override
	public User login(String loginname, String password) {
		return dao.login(loginname, password);
	}

	public int updateUser(String id, User user) {
		return dao.updateUser(id, user);
	}
}
