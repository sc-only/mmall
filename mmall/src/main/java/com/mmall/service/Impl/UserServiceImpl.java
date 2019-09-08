package com.mmall.service.Impl;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import com.mmall.service.IUserService;
import com.mmall.dao.UserMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private userMapper userMapper;

    @Override
    public ServerResponse<User> login(String username, String password) {
        int resultCount =userMapper.checkUsername(username);
        if(resultCount==0){
            ServerResponse.createByErrorMessage("用户名不存在");
        }
        //todo密码登录MD5
        User user = userMapper.selectLogin(username,password);
        if(user==null){
            return ServerResponse.createByErrorMessage("密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功",user);
    }
}
