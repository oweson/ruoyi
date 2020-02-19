package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.Card02Mapper;
import com.ruoyi.system.domain.Card02;
import com.ruoyi.system.service.ICard02Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 身份证Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-05
 */
@Service
public class Card02ServiceImpl implements ICard02Service 
{
    @Autowired
    private Card02Mapper card02Mapper;

    /**
     * 查询身份证
     * 
     * @param id 身份证ID
     * @return 身份证
     */
    @Override
    public Card02 selectCard02ById(Long id)
    {
        return card02Mapper.selectCard02ById(id);
    }

    /**
     * 查询身份证列表
     * 
     * @param card02 身份证
     * @return 身份证
     */
    @Override
    public List<Card02> selectCard02List(Card02 card02)
    {
        return card02Mapper.selectCard02List(card02);
    }

    /**
     * 新增身份证
     * 
     * @param card02 身份证
     * @return 结果
     */
    @Override
    public int insertCard02(Card02 card02)
    {

        return card02Mapper.insertCard02(card02);
    }

    /**
     * 修改身份证
     * 
     * @param card02 身份证
     * @return 结果
     */
    @Override
    public int updateCard02(Card02 card02)
    {
        return card02Mapper.updateCard02(card02);
    }

    /**
     * 删除身份证对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCard02ByIds(String ids)
    {
        return card02Mapper.deleteCard02ByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除身份证信息
     * 
     * @param id 身份证ID
     * @return 结果
     */
    @Override
    public int deleteCard02ById(Long id)
    {
        return card02Mapper.deleteCard02ById(id);
    }
}
