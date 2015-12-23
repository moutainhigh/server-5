package com.need.share.dao.jdbc.api.trade;

import java.util.List;

import com.need.share.dao.jdbc.api.trade.po.TradeBasePO;

public interface TradeBaseDAO {

	List<TradeBasePO> getByTradeNo(String tradeNo);
	
}