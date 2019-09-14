package com.mmall.demo.service;

import com.mmall.demo.common.ServerResponse;
import com.mmall.demo.pojo.Product;
import com.mmall.demo.vo.ProductDetailVo;

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> serSaleStatus(Integer productId,Integer status);
    ServerResponse<ProductDetailVo> manegeProductDetail(Integer productId);
}
