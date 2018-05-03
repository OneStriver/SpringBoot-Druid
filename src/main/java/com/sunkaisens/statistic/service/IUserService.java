package com.sunkaisens.statistic.service;

import java.util.List;

import com.sunkaisens.statistic.model.User;

public interface IUserService {
	public List<User> getUsers();
	public void updateUser();
}
