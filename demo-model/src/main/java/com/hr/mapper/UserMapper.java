package com.hr.mapper;

import com.hr.model.User;

public interface UserMapper {
    
	User selectByPrimaryKey(int id);
}