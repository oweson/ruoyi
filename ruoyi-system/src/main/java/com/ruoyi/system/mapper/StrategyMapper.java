package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Strategy;

/**
 * 收藏Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-28
 */
public interface StrategyMapper 
{
    /**
     * 查询收藏
     * 
     * @param id 收藏ID
     * @return 收藏
     */
    public Strategy selectStrategyById(Long id);

    /**
     * 查询收藏列表
     * 
     * @param strategy 收藏
     * @return 收藏集合
     */
    public List<Strategy> selectStrategyList(Strategy strategy);

    /**
     * 新增收藏
     * 
     * @param strategy 收藏
     * @return 结果
     */
    public int insertStrategy(Strategy strategy);

    /**
     * 修改收藏
     * 
     * @param strategy 收藏
     * @return 结果
     */
    public int updateStrategy(Strategy strategy);

    /**
     * 删除收藏
     * 
     * @param id 收藏ID
     * @return 结果
     */
    public int deleteStrategyById(Long id);

    /**
     * 批量删除收藏
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStrategyByIds(String[] ids);
}
