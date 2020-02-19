package com.ruoyi.system.service;

import com.ruoyi.system.domain.Card02;
import java.util.List;

/**
 * 身份证Service接口
 * 
 * @author ruoyi
 * @date 2020-02-05
 */
public interface ICard02Service 
{
    /**
     * 查询身份证
     * 
     * @param id 身份证ID
     * @return 身份证
     */
    public Card02 selectCard02ById(Long id);

    /**
     * 查询身份证列表
     * 
     * @param card02 身份证
     * @return 身份证集合
     */
    public List<Card02> selectCard02List(Card02 card02);

    /**
     * 新增身份证
     * 
     * @param card02 身份证
     * @return 结果
     */
    public int insertCard02(Card02 card02);

    /**
     * 修改身份证
     * 
     * @param card02 身份证
     * @return 结果
     */
    public int updateCard02(Card02 card02);

    /**
     * 批量删除身份证
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCard02ByIds(String ids);

    /**
     * 删除身份证信息
     * 
     * @param id 身份证ID
     * @return 结果
     */
    public int deleteCard02ById(Long id);
}
