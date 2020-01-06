package com.icard.credit.domain;

import com.icard.common.core.domain.BaseEntity;

import java.math.BigDecimal;

public class TradeHistory extends BaseEntity {
    private Long hisId;

    private String storyName;

    private String storyNote;

    private String tradeType;

    private String tradeStatus;

    private String dealsStatus;

    private String recordedWay;

    private String payingStatus;

    private String agentNo;

    private String agentName;

    private String posType;

    private String cloQuick;

    private String terminalNo;

    private String tradeTime;

    private String tradeCode;

    private String consumeType;

    private String consumeCardId;

    private String cardSort;

    private BigDecimal tradeAmount;

    private BigDecimal tradeFee;

    private String cardType;

    private String authenStatus;

    private String cardBank;

    private String backCode;

    private String backMsg;

    private String flowStatus;

    private String supperTrade;

    private String bothFree;

    private String activityName;

    private String payChannel;

    public Long getHisId() {
        return hisId;
    }

    public void setHisId(Long hisId) {
        this.hisId = hisId;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName == null ? null : storyName.trim();
    }

    public String getStoryNote() {
        return storyNote;
    }

    public void setStoryNote(String storyNote) {
        this.storyNote = storyNote == null ? null : storyNote.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public String getDealsStatus() {
        return dealsStatus;
    }

    public void setDealsStatus(String dealsStatus) {
        this.dealsStatus = dealsStatus == null ? null : dealsStatus.trim();
    }

    public String getRecordedWay() {
        return recordedWay;
    }

    public void setRecordedWay(String recordedWay) {
        this.recordedWay = recordedWay == null ? null : recordedWay.trim();
    }

    public String getPayingStatus() {
        return payingStatus;
    }

    public void setPayingStatus(String payingStatus) {
        this.payingStatus = payingStatus == null ? null : payingStatus.trim();
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo == null ? null : agentNo.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType == null ? null : posType.trim();
    }

    public String getCloQuick() {
        return cloQuick;
    }

    public void setCloQuick(String cloQuick) {
        this.cloQuick = cloQuick == null ? null : cloQuick.trim();
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo == null ? null : terminalNo.trim();
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime == null ? null : tradeTime.trim();
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode == null ? null : tradeCode.trim();
    }

    public String getConsumeType() {
        return consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType == null ? null : consumeType.trim();
    }

    public String getConsumeCardId() {
        return consumeCardId;
    }

    public void setConsumeCardId(String consumeCardId) {
        this.consumeCardId = consumeCardId == null ? null : consumeCardId.trim();
    }

    public String getCardSort() {
        return cardSort;
    }

    public void setCardSort(String cardSort) {
        this.cardSort = cardSort == null ? null : cardSort.trim();
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public BigDecimal getTradeFee() {
        return tradeFee;
    }

    public void setTradeFee(BigDecimal tradeFee) {
        this.tradeFee = tradeFee;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getAuthenStatus() {
        return authenStatus;
    }

    public void setAuthenStatus(String authenStatus) {
        this.authenStatus = authenStatus == null ? null : authenStatus.trim();
    }

    public String getCardBank() {
        return cardBank;
    }

    public void setCardBank(String cardBank) {
        this.cardBank = cardBank == null ? null : cardBank.trim();
    }

    public String getBackCode() {
        return backCode;
    }

    public void setBackCode(String backCode) {
        this.backCode = backCode == null ? null : backCode.trim();
    }

    public String getBackMsg() {
        return backMsg;
    }

    public void setBackMsg(String backMsg) {
        this.backMsg = backMsg == null ? null : backMsg.trim();
    }

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus == null ? null : flowStatus.trim();
    }

    public String getSupperTrade() {
        return supperTrade;
    }

    public void setSupperTrade(String supperTrade) {
        this.supperTrade = supperTrade == null ? null : supperTrade.trim();
    }

    public String getBothFree() {
        return bothFree;
    }

    public void setBothFree(String bothFree) {
        this.bothFree = bothFree == null ? null : bothFree.trim();
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel == null ? null : payChannel.trim();
    }
}