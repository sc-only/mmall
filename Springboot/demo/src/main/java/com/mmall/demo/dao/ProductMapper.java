package com.mmall.demo.dao;

import com.mmall.demo.pojo.Product;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectList();

    List<Product> selectByNameAndProductId(String productName,Integer productId);

    List<Product> selectByNameAndCategoryIds(String productName,List<Integer> categoryIdList);


}