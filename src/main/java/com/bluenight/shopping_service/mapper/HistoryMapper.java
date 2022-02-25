package com.bluenight.shopping_service.mapper;

import com.bluenight.shopping_service.data.MemberProductHistoryVO;
import com.bluenight.shopping_service.data.PageConnnecthistoryVO;
import com.bluenight.shopping_service.data.ReviewHistoryVO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HistoryMapper {
    void insertReviewReportHistory(ReviewHistoryVO data);
    void insertpageConnectHistory(PageConnnecthistoryVO data);
    void insertMemberProductHistory(MemberProductHistoryVO data);
}
