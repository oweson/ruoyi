package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LifeBuyMapper;
import com.ruoyi.system.domain.LifeBuy;
import com.ruoyi.system.service.ILifeBuyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生活日常消费Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-17
 */
@Service
public class LifeBuyServiceImpl implements ILifeBuyService 
{
    @Autowired
    private LifeBuyMapper lifeBuyMapper;

    /**
     * 查询生活日常消费
     * 
     * @param id 生活日常消费ID
     * @return 生活日常消费
     */
    @Override
    public LifeBuy selectLifeBuyById(Long id)
    {
        return lifeBuyMapper.selectLifeBuyById(id);
    }

    /**
     * 查询生活日常消费列表
     * 
     * @param lifeBuy 生活日常消费
     * @return 生活日常消费
     */
    @Override
    public List<LifeBuy> selectLifeBuyList(LifeBuy lifeBuy)
    {
        return lifeBuyMapper.selectLifeBuyList(lifeBuy);
    }

    /**
     * 新增生活日常消费
     * 
     * @param lifeBuy 生活日常消费
     * @return 结果
     */
    @Override
    public int insertLifeBuy(LifeBuy lifeBuy)
    {
        lifeBuy.setCreateTime(DateUtils.getNowDate());
        return lifeBuyMapper.insertLifeBuy(lifeBuy);
    }

    /**
     * 修改生活日常消费
     * 
     * @param lifeBuy 生活日常消费
     * @return 结果
     */
    @Override
    public int updateLifeBuy(LifeBuy lifeBuy)
    {
        return lifeBuyMapper.updateLifeBuy(lifeBuy);
    }

    /**
     * 删除生活日常消费对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLifeBuyByIds(String ids)
    {
        return lifeBuyMapper.deleteLifeBuyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生活日常消费信息
     * 
     * @param id 生活日常消费ID
     * @return 结果
     */
    @Override
    public int deleteLifeBuyById(Long id)
    {
        return lifeBuyMapper.deleteLifeBuyById(id);
    }
}
