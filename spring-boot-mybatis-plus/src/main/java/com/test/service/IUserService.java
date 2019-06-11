package com.test.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.test.entity.User;

public interface IUserService extends IService<User>{
	
	boolean deleteAll();

	public List<User> selectListBySQL();

}
