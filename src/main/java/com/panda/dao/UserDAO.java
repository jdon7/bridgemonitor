package com.panda.dao;

import com.panda.model.User;

/**
 * @author qiaoel
 *
 */

public interface UserDAO {
 
    /**
     * 添加新用户
     * @param user
     * @return
     */
    public int insertUser(User user);
    /**
     * 
     * @param nickname
     * @return
     */
    public User getUser(String nickname);
     
}
