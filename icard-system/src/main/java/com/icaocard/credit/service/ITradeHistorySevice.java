package com.icard.credit.service;

import com.icard.credit.domain.CreditCard;
import com.icard.credit.domain.TradeHistory;

import java.util.List;

/**
 * 交易记录 业务层
 * 
 * @author icard
 */
public interface ITradeHistorySevice
{
    /**
     * 根据条件分页查询卡片列表
     * 
     * @param tradeHis 卡片信息
     * @return 卡片息集合信息
     */
    public List<TradeHistory> selectTradeHisList(TradeHistory tradeHis);


    /**
     * 通过ID查询卡片
     * 
     * @param tradeHisId 卡片ID
     * @return 卡片对象信息
     */
    public TradeHistory selectTradeHisById(Long tradeHisId);

    /**
     * 通过卡片ID删除卡片
     * 
     * @param cardId 卡片ID
     * @return 结果
     */
    public int deleteCardById(Long cardId);

    /**
     * 批量删除卡片信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    public int deleteCardByIds(String ids) throws Exception;


    /**
     * 导入卡片数据
     *
     * @param cardList 卡片数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importCard(List<CreditCard> cardList, Boolean isUpdateSupport, String operName);


}
