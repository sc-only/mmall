package com.mmall.demo.dao;

import com.mmall.demo.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int checkUsername(String username);

    int checkEmail(String email);

    User selectLogin(String username, String password);

    String selectQuestionByUsername(String username);

    int checkAnswer(String username,String question, String answer);

    int updatePasswordByUsername(String username, String passwordNew);

    int checkPassword(String password, Integer userId);

    int checkEmailByUserId(String email, Integer userId);
}