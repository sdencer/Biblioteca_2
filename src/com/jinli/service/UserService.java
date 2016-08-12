package com.jinli.service;

import com.jinli.db.UserDB;
import com.jinli.model.User;

import java.util.List;
import java.util.Map;

public class UserService {
    public User checkUser(User user){
        Map<Integer, User> userMap = UserDB.getUserMap();
        if (userMap.containsKey(user.getId())) {
            User userInDB = userMap.get(user.getId());
            if (userInDB.getPassword().equals(user.getPassword())) {
                return userInDB;
            }
        }
        return null;

    }
}
