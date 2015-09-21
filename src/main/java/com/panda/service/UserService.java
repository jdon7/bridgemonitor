package com.panda.service;

import com.panda.model.User;

public interface UserService {
	 
    public int insertUser(User user);
    
    public User getUser(String nickname);
}
