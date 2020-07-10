package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DemandMapper;
import com.ruoyi.system.domain.Demand;
import com.ruoyi.system.service.IDemandService;
import com.ruoyi.common.core.text.Convert;

/**
 * 需求Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-06-03
 */
@Service
public class DemandServiceImpl implements IDemandService 
{
    @Autowired
    private DemandMapper demandMapper;

    /**
     * 查询需求
     * 
     * @param id 需求ID
     * @return 需求
     */
    @Override
    public Demand selectDemandById(Long id)
    {
        return demandMapper.selectDemandById(id);
    }

    /**
     * 查询需求列表
     * 
     * @param demand 需求
     * @return 需求
     */
    @Override
    public List<Demand> selectDemandList(Demand demand)
    {
        return demandMapper.selectDemandList(demand);
    }

    /**
     * 新增需求
     * 
     * @param demand 需求
     * @return 结果
     */
    @Override
    public int insertDemand(Demand demand)
    {
        demand.setCreateTime(DateUtils.getNowDate());
        return demandMapper.insertDemand(demand);
    }

    /**
     * 修改需求
     * 
     * @param demand 需求
     * @return 结果
     */
    @Override
    public int updateDemand(Demand demand)
    {
        return demandMapper.updateDemand(demand);
    }

    /**
     * 删除需求对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDemandByIds(String ids)
    {
        return demandMapper.deleteDemandByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除需求信息
     * 
     * @param id 需求ID
     * @return 结果
     */
    @Override
    public int deleteDemandById(Long id)
    {
        return demandMapper.deleteDemandById(id);
    }
}
