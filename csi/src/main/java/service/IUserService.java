package service;

import pojo.User;

public interface IUserService {

	User login(String loginname, String password);
	
	int updateUser(String id, User user) ;
}
