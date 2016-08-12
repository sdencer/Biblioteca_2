package com.jinli.view;

import com.jinli.model.User;
import com.jinli.service.UserService;
import com.jinli.util.StringUtil;
import com.jinli.control.LoginControl;


public class LoginView {
    LoginControl loginControl = new LoginControl();
    MainView mainView = new MainView();
    UserService userService = new UserService();

    public void login(){
        welcome();
//        System.out.println("please input your name:");
//        String username = StringUtil.getInputString();
        System.out.println("please input your id");
        Integer userId = StringUtil.getInputInt();
        System.out.println("please input your password");
        String password  = StringUtil.getInputString();
        User user = new User();
        user.setId(userId);
        user.setPassword(password);
        user = userService.checkUser(user);
        if (user == null) {
            System.out.println("please input valid user");
            return;
        }


        System.out.println("Welcome, " + loginControl.getUserName(user.getName()));
        goMainView(user);
    }

    public void welcome(){
        System.out.println("Welcome to Biblioteca");
    }

    public void goMainView(User user){
        mainView.showMainMenu(user);
    }





}
