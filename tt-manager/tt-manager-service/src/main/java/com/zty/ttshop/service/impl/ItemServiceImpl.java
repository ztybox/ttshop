package com.zty.ttshop.service.impl;

import com.zty.ttshop.dao.TbItemMapper;
import com.zty.ttshop.pojo.po.TbItem;
import com.zty.ttshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemDao;
    @Override
    public TbItem getById(Long id) {
        return itemDao.selectByPrimaryKey(id);
    }
}
