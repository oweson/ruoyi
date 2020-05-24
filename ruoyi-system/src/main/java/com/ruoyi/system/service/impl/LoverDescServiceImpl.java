package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LoverDescMapper;
import com.ruoyi.system.domain.LoverDesc;
import com.ruoyi.system.service.ILoverDescService;
import com.ruoyi.common.core.text.Convert;

/**
 * 求偶标准Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-04
 */
@Service
public class LoverDescServiceImpl implements ILoverDescService 
{
    @Autowired
    private LoverDescMapper loverDescMapper;

    /**
     * 查询求偶标准
     * 
     * @param id 求偶标准ID
     * @return 求偶标准
     */
    @Override
    public LoverDesc selectLoverDescById(Long id)
    {
        return loverDescMapper.selectLoverDescById(id);
    }

    /**
     * 查询求偶标准列表
     * 
     * @param loverDesc 求偶标准
     * @return 求偶标准
     */
    @Override
    public List<LoverDesc> selectLoverDescList(LoverDesc loverDesc)
    {
        return loverDescMapper.selectLoverDescList(loverDesc);
    }

    /**
     * 新增求偶标准
     * 
     * @param loverDesc 求偶标准
     * @return 结果
     */
    @Override
    public int insertLoverDesc(LoverDesc loverDesc)
    {
        loverDesc.setCreateTime(DateUtils.getNowDate());
        return loverDescMapper.insertLoverDesc(loverDesc);
    }

    /**
     * 修改求偶标准
     * 
     * @param loverDesc 求偶标准
     * @return 结果
     */
    @Override
    public int updateLoverDesc(LoverDesc loverDesc)
    {
        return loverDescMapper.updateLoverDesc(loverDesc);
    }

    /**
     * 删除求偶标准对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLoverDescByIds(String ids)
    {
        return loverDescMapper.deleteLoverDescByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除求偶标准信息
     * 
     * @param id 求偶标准ID
     * @return 结果
     */
    @Override
    public int deleteLoverDescById(Long id)
    {
        return loverDescMapper.deleteLoverDescById(id);
    }
}
