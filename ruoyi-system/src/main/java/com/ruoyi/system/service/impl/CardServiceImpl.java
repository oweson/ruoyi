package com.ruoyi.system.service.impl;

import com.ruoyi.system.mapper.CardMapper;
import com.ruoyi.system.oweson.domain.Card;
import com.ruoyi.system.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/1/12 16:54
 */
@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardMapper cardMapper;

    @Override
    public Card getCardById(Integer id) {
        return cardMapper.selectByPrimaryKey(id);
    }
}
