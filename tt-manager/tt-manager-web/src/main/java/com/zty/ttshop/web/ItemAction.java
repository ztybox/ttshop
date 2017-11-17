package com.zty.ttshop.web;

import com.zty.ttshop.pojo.po.TbItem;
import com.zty.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Scope("prototype")
public class ItemAction {

    @Autowired
    private ItemService service;

    @RequestMapping(value="/item/{itemId}",method = RequestMethod.GET)
    @ResponseBody
    public TbItem printToPage(@PathVariable("itemId") Long id){

        return service.getById(id);
    }
}
