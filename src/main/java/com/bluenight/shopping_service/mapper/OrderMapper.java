package com.bluenight.shopping_service.mapper;

import java.util.List;

import com.bluenight.shopping_service.data.OrderInfoVO;
import com.bluenight.shopping_service.data.OrderSummaryVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    void insertOrderInfo(List<OrderInfoVO> dataList);
    List<OrderSummaryVO> selectOrderSummary(Integer seq, Integer offset);
    Integer selectOrderSummaryCount(Integer seq);
}
