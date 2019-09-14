package com.mmall.demo.service;

import com.github.pagehelper.PageInfo;
import com.mmall.demo.common.ServerResponse;
import com.mmall.demo.pojo.Product;
import com.mmall.demo.vo.ProductDetailVo;

public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);
    ServerResponse<String> serSaleStatus(Integer productId,Integer status);
    ServerResponse<ProductDetailVo> manegeProductDetail(Integer productId);
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
}
