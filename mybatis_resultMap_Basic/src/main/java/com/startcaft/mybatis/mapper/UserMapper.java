package com.startcaft.mybatis.mapper;


import com.startcaft.mybatis.po.User;

/**
 * mapper接口，用户管理，相当于dao接口
 */
public interface UserMapper {
	
	public User findUserByResultMap(int id) throws Exception;
}
