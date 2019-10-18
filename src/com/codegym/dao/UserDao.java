package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User>users;
    static {
        users=new ArrayList<>() ;
    User u1=new User("john","123456","John","john@gmail.com",10);
    users.add(u1);
    User u2=new User("bill","123456","Bill","bill@gmail.com",15);
    users.add(u2);
        User u3=new User("mike","123456","Mike","mike@gmail.com",16);
    users.add(u3);
    }
    public static User checkLogin(Login login){
        for (User u:users) {
            if(u.getAccount().equals(login.getAccount())
            &&u.getPassword().equals(login.getPassword())){
                return u;

            }
        }return null;
    }

}
