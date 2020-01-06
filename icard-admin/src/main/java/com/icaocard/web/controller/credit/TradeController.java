package com.icard.web.controller.credit;

import com.icard.common.core.controller.BaseController;
import com.icard.common.core.page.TableDataInfo;
import com.icard.credit.domain.CreditCard;
import com.icard.credit.domain.TradeHistory;
import com.icard.credit.service.ICreditCardService;
import com.icard.credit.service.ITradeHistorySevice;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * 
 * @author icard
 */
@Controller
@RequestMapping("/credit/trade")
public class TradeController extends BaseController
{
    private String prefix = "credit/trade";

    @Autowired
    private ITradeHistorySevice iTradeHistorySevice;

    @RequiresPermissions("credit:tradeHis:view")
    @GetMapping()
    public String role()
    {
        return prefix + "/tradeHis";
    }

    @RequiresPermissions("credit:tradeHis:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TradeHistory tradeHistory)
    {
        startPage();
        List<TradeHistory> list = iTradeHistorySevice.selectTradeHisList(tradeHistory);
        return getDataTable(list);
    }
}