package com.blog.dao;


import com.blog.entity.User;

public interface UserDao {

	User selectOne(int userId);

}
