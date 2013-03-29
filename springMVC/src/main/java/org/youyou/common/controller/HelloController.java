package org.youyou.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.youyou.common.dao.UserDao;
import org.youyou.common.dao.UserMapper;
import org.youyou.common.domain.User;

import javax.annotation.Resource;

/**
 * TODO:add description of class here, then delete the line.
 *
 * @author youpengfeiinfo
 * @version 13-3-29
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {

    @Resource(name = "userMapper")
    private UserMapper userMapper;
    @Resource
    private UserDao userDao;



    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        User user= userMapper.getUser("1");
        User user1=userDao.getUser(1);
        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";
    }
}
