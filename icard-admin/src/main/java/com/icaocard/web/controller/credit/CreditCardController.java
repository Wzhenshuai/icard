package com.icard.web.controller.credit;

import com.icard.common.core.controller.BaseController;
import com.icard.common.core.page.TableDataInfo;
import com.icard.credit.domain.CreditCard;
import com.icard.credit.service.ICreditCardService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色信息
 * 
 * @author icard
 */
@Controller
@RequestMapping("/credit/card")
public class CreditCardController extends BaseController
{
    private String prefix = "credit/card";

    @Autowired
    private ICreditCardService iCreditCardService;

    @RequiresPermissions("credit:card:view")
    @GetMapping()
    public String role()
    {
        return prefix + "/card";
    }

    @RequiresPermissions("credit:card:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CreditCard card)
    {
        startPage();
        List<CreditCard> list = iCreditCardService.selectCardList(card);
        return getDataTable(list);
    }
}