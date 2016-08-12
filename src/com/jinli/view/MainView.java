package com.jinli.view;

import com.jinli.model.User;
import com.jinli.util.StringUtil;
import com.jinli.control.MainControl;

/**
 * Created by jinli on 8/4/16.
 */
public class MainView {
    MainControl mainControl = new MainControl();

    public void showMainMenu(User user){
        while (true) {
            System.out.println("===================================");
            System.out.println("1. BookList");
            System.out.println("2. Checkout Book");
            System.out.println("3. Return Book");
            System.out.println("4. MovieList");
            System.out.println("5. Checkout Movie");
            if (user.getLevel() == 0) {
                System.out.println("6. user Information");
            }
            System.out.println("0. exit");
            System.out.println("please input the number:");
            Integer menu = StringUtil.getInputInt();
            if (menu == 0) {
                break;
            }
            mainControl.choseMenu(menu, user);
        }

    }
}
