package com.mmall.demo.service;

import com.mmall.demo.common.ServerResponse;
import com.mmall.demo.pojo.Product;

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
}
