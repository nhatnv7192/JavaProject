package com.services;

import java.util.List;

import com.entities.Users;

public interface UserServices {
	public List<Users> selectList();
	public boolean delete(Users users);
	public boolean saveOrUpdate(Users users);
}
