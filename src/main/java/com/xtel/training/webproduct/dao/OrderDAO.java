package com.xtel.training.webproduct.dao;

import com.xtel.training.webproduct.model.CartInfo;
import com.xtel.training.webproduct.model.OrderDetailInfo;
import com.xtel.training.webproduct.model.OrderInfo;
import com.xtel.training.webproduct.model.PaginationResult;

import java.util.List;

public interface OrderDAO {
    public void saveOrder(CartInfo cartInfo);

    public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);

    public OrderInfo getOrderInfo(String orderId);

    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
