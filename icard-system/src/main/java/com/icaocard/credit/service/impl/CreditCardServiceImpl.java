package com.icard.credit.service.impl;


import com.icard.credit.domain.CreditCard;
import com.icard.credit.mapper.CreditCardMapper;
import com.icard.credit.service.ICreditCardService;
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
public class CreditCardServiceImpl implements ICreditCardService
{
    private static final Logger log = LoggerFactory.getLogger(CreditCardServiceImpl.class);

    @Autowired
    private CreditCardMapper creditCardMapper;


    @Override
    public List<CreditCard> selectCardList(CreditCard card) {
        return creditCardMapper.findList(card);
    }

    @Override
    public CreditCard selectCardById(Long cardId) {
        return creditCardMapper.getByLongId(cardId);
    }

    @Override
    public int deleteCardById(Long cardId) {
        return creditCardMapper.delete(cardId);
    }

    @Override
    public int deleteCardByIds(String ids) throws Exception {
        return 0;
    }

    @Override
    public int insertCard(CreditCard card) {
        return creditCardMapper.insert(card);
    }

    @Override
    public int updateCardInfo(CreditCard card) {
        return creditCardMapper.update(card);
    }

    @Override
    public int upCardAmount(CreditCard card) {
        return 0;
    }

    @Override
    public String importCard(List<CreditCard> cardList, Boolean isUpdateSupport, String operName) {
        return null;
    }
}
