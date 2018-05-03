package com.sunkaisens.statistic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sunkaisens.statistic.model.User;

@Mapper
public interface UserDao {
	public List<User> getUsers();
	public void updateUser(User user);
	public void addUser(User user);
	public void deleteUserById(int id);
}
