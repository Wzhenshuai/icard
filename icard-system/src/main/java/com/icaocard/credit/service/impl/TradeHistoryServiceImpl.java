package com.icard.credit.service.impl;


import com.icard.credit.domain.CreditCard;
import com.icard.credit.domain.TradeHistory;
import com.icard.credit.mapper.CreditCardMapper;
import com.icard.credit.mapper.TradeHistoryMapper;
import com.icard.credit.mapper.TradeHistoryMapper2;
import com.icard.credit.service.ICreditCardService;
import com.icard.credit.service.ITradeHistorySevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户 业务层处理
 *
 * @author icard
 */
@Service
public class TradeHistoryServiceImpl implements ITradeHistorySevice {
    private static final Logger log = LoggerFactory.getLogger(TradeHistoryServiceImpl.class);

    @Autowired
    private TradeHistoryMapper tradeHistoryMapper;
    @Override
    public List<TradeHistory> selectTradeHisList(TradeHistory tradeHis) {
        return tradeHistoryMapper.findList(tradeHis);
    }

    @Override
    public TradeHistory selectTradeHisById(Long tradeHisId) {
        return null;
    }

    @Override
    public int deleteCardById(Long cardId) {
        return 0;
    }

    @Override
    public int deleteCardByIds(String ids) throws Exception {
        return 0;
    }

    @Override
    public String importCard(List<CreditCard> cardList, Boolean isUpdateSupport, String operName) {
        return null;
    }
}
