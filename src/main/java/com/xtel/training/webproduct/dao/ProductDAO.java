package com.xtel.training.webproduct.dao;

import com.xtel.training.webproduct.entities.Product;
import com.xtel.training.webproduct.model.PaginationResult;
import com.xtel.training.webproduct.model.ProductInfo;

public interface ProductDAO {
    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code);

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage);

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult, int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);
}
