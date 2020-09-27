package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Shijing;

/**
 * shijingService接口
 * 
 * @author ruoyi
 * @date 2020-09-27
 */
public interface IShijingService 
{
    /**
     * 查询shijing
     * 
     * @param title shijingID
     * @return shijing
     */
    public Shijing selectShijingById(String title);

    /**
     * 查询shijing列表
     * 
     * @param shijing shijing
     * @return shijing集合
     */
    public List<Shijing> selectShijingList(Shijing shijing);

    /**
     * 新增shijing
     * 
     * @param shijing shijing
     * @return 结果
     */
    public int insertShijing(Shijing shijing);

    /**
     * 修改shijing
     * 
     * @param shijing shijing
     * @return 结果
     */
    public int updateShijing(Shijing shijing);

    /**
     * 批量删除shijing
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteShijingByIds(String ids);

    /**
     * 删除shijing信息
     * 
     * @param title shijingID
     * @return 结果
     */
    public int deleteShijingById(String title);
}
