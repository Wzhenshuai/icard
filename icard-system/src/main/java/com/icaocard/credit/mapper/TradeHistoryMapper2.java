package com.icard.credit.mapper;

import com.icard.credit.domain.TradeHistory;

import java.util.List;

public interface TradeHistoryMapper2 {
    int deleteByPrimaryKey(Long hisId);

    int insert(TradeHistory record);

    int insertSelective(TradeHistory record);

    TradeHistory selectByPrimaryKey(Long hisId);

    int updateByPrimaryKeySelective(TradeHistory record);

    int updateByPrimaryKey(TradeHistory record);


    List<TradeHistory> findList2();
}