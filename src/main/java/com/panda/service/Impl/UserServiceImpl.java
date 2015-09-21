package com.panda.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panda.dao.UserDAO;
import com.panda.model.User;
import com.panda.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDAO;
     
    @Override
    public int insertUser(User user) {
        return userDAO.insertUser(user);
    }

	@Override
	public User getUser(String nickname) {
		return userDAO.getUser(nickname);
	}
    
 
}
