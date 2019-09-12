package com.mmall.demo.service;

import com.mmall.demo.common.ServerResponse;

import javax.servlet.http.HttpSession;

public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
}
