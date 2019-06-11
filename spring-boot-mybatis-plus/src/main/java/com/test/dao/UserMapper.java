package com.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.test.entity.User;

public interface UserMapper extends SuperMapper<User> {
	
	int deletAll();
	
	@Select(value = { "select test_id as id, name, age, test_type from user" })
	List<User> selectListBySQL();

}
