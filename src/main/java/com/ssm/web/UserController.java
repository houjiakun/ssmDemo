package com.ssm.web;

import com.alibaba.fastjson.JSON;
import com.ssm.entity.User;
import com.ssm.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class UserController{

    @Autowired
    private SystemService systemService;

    @RequestMapping(value = {"list", ""})
    @ResponseBody
    public String list(User user) {
        List<User> userList = systemService.findUser(user);
        return JSON.toJSONString(userList);
    }

    @RequestMapping(value = "insert")
    @ResponseBody
    public String insert(User user) {
        systemService.insert(user);
        return "success";
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(User user) {
        systemService.update(user);
        return "success";
    }

    @RequestMapping(value = "delete")
    @ResponseBody
    public String delete(User user) {
        systemService.delete(user);
        return "success";
    }

}
