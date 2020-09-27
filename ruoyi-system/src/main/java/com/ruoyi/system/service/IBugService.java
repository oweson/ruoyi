package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Bug;

/**
 * bug记录Service接口
 * 
 * @author ruoyi
 * @date 2020-09-26
 */
public interface IBugService 
{
    /**
     * 查询bug记录
     * 
     * @param id bug记录ID
     * @return bug记录
     */
    public Bug selectBugById(Long id);

    /**
     * 查询bug记录列表
     * 
     * @param bug bug记录
     * @return bug记录集合
     */
    public List<Bug> selectBugList(Bug bug);

    /**
     * 新增bug记录
     * 
     * @param bug bug记录
     * @return 结果
     */
    public int insertBug(Bug bug);

    /**
     * 修改bug记录
     * 
     * @param bug bug记录
     * @return 结果
     */
    public int updateBug(Bug bug);

    /**
     * 批量删除bug记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBugByIds(String ids);

    /**
     * 删除bug记录信息
     * 
     * @param id bug记录ID
     * @return 结果
     */
    public int deleteBugById(Long id);
}
