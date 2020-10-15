package dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import dao.IUserDao;
import pojo.User;
import utils.TxDBUtils;

public class UserDao implements IUserDao {

	@Override
	public User login(String loginname, String password) {
		String sql = "select * from user where loginname=? and password=?";
		QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
		try {
			return runner.query(sql, new BeanHandler<User>(User.class), loginname, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateUser(String id, User user) {
		String sql = "update user set password=? where id=?";
		QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
		try {
			return runner.update(sql, user.getPassword(), id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
