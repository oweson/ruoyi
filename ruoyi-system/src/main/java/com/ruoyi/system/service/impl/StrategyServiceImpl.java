package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StrategyMapper;
import com.ruoyi.system.domain.Strategy;
import com.ruoyi.system.service.IStrategyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 收藏Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
@Service
public class StrategyServiceImpl implements IStrategyService 
{
    @Autowired
    private StrategyMapper strategyMapper;

    /**
     * 查询收藏
     * 
     * @param id 收藏ID
     * @return 收藏
     */
    @Override
    public Strategy selectStrategyById(Long id)
    {
        return strategyMapper.selectStrategyById(id);
    }

    /**
     * 查询收藏列表
     * 
     * @param strategy 收藏
     * @return 收藏
     */
    @Override
    public List<Strategy> selectStrategyList(Strategy strategy)
    {
        return strategyMapper.selectStrategyList(strategy);
    }

    /**
     * 新增收藏
     * 
     * @param strategy 收藏
     * @return 结果
     */
    @Override
    public int insertStrategy(Strategy strategy)
    {
        // todo check unique
        strategy.setCreateTime(DateUtils.getNowDate());
        return strategyMapper.insertStrategy(strategy);
    }

    /**
     * 修改收藏
     * 
     * @param strategy 收藏
     * @return 结果
     */
    @Override
    public int updateStrategy(Strategy strategy)
    {
        return strategyMapper.updateStrategy(strategy);
    }

    /**
     * 删除收藏对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStrategyByIds(String ids)
    {
        return strategyMapper.deleteStrategyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除收藏信息
     * 
     * @param id 收藏ID
     * @return 结果
     */
    @Override
    public int deleteStrategyById(Long id)
    {
        return strategyMapper.deleteStrategyById(id);
    }
}
