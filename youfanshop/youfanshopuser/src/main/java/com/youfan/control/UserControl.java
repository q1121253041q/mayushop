package com.youfan.control;

import com.youfan.model.User;
import com.youfan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by youfan on 2018/6/6 0006.
 */
@Controller
public class UserControl {
    @Autowired
    UserService userServive;


    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userServive.findUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
        }
        return user;
    }
}
