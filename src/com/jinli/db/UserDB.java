package com.jinli.db;

import com.jinli.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDB {
    private static Map<Integer, User> userMap = null;
    public static Map<Integer, User> getUserMap(){
        User user1 = new User(1, "lily", "123","123@tw.com", 110l, 0);
        User user2 = new User(2, "Jon", "123","123@tw.com", 110l, 0);
        User user3 = new User(3, "lucy", "123","123@tw.com", 110l, 1);

        userMap = new HashMap<>();
        userMap.put(1, user1);
        userMap.put(2, user2);
        userMap.put(3, user3);
        return userMap;
    }
}
