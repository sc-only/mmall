package com.mmall.demo.service;

import com.mmall.demo.common.ServerResponse;

public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
}
