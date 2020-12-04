package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DelistingMapper;
import com.ruoyi.system.domain.Delisting;
import com.ruoyi.system.service.IDelistingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 恋爱之路Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
@Service
public class DelistingServiceImpl implements IDelistingService 
{
    @Autowired
    private DelistingMapper delistingMapper;

    /**
     * 查询恋爱之路
     * 
     * @param id 恋爱之路ID
     * @return 恋爱之路
     */
    @Override
    public Delisting selectDelistingById(Long id)
    {
        return delistingMapper.selectDelistingById(id);
    }

    /**
     * 查询恋爱之路列表
     * 
     * @param delisting 恋爱之路
     * @return 恋爱之路
     */
    @Override
    public List<Delisting> selectDelistingList(Delisting delisting)
    {
        return delistingMapper.selectDelistingList(delisting);
    }

    /**
     * 新增恋爱之路
     * 
     * @param delisting 恋爱之路
     * @return 结果
     */
    @Override
    public int insertDelisting(Delisting delisting)
    {
        delisting.setCreateTime(DateUtils.getNowDate());
        return delistingMapper.insertDelisting(delisting);
    }

    /**
     * 修改恋爱之路
     * 
     * @param delisting 恋爱之路
     * @return 结果
     */
    @Override
    public int updateDelisting(Delisting delisting)
    {
        delisting.setUpdateTime(DateUtils.getNowDate());
        return delistingMapper.updateDelisting(delisting);
    }

    /**
     * 删除恋爱之路对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDelistingByIds(String ids)
    {
        return delistingMapper.deleteDelistingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除恋爱之路信息
     * 
     * @param id 恋爱之路ID
     * @return 结果
     */
    @Override
    public int deleteDelistingById(Long id)
    {
        return delistingMapper.deleteDelistingById(id);
    }
}
