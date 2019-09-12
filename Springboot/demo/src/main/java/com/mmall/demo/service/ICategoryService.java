package com.mmall.demo.service;

import com.mmall.demo.common.ServerResponse;
import com.mmall.demo.pojo.Category;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
