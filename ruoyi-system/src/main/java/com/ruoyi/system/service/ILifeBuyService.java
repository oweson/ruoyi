package com.ruoyi.system.service;

import com.ruoyi.system.domain.LifeBuy;
import java.util.List;

/**
 * 生活日常消费Service接口
 * 
 * @author ruoyi
 * @date 2020-02-17
 */
public interface ILifeBuyService 
{
    /**
     * 查询生活日常消费
     * 
     * @param id 生活日常消费ID
     * @return 生活日常消费
     */
    public LifeBuy selectLifeBuyById(Long id);

    /**
     * 查询生活日常消费列表
     * 
     * @param lifeBuy 生活日常消费
     * @return 生活日常消费集合
     */
    public List<LifeBuy> selectLifeBuyList(LifeBuy lifeBuy);

    /**
     * 新增生活日常消费
     * 
     * @param lifeBuy 生活日常消费
     * @return 结果
     */
    public int insertLifeBuy(LifeBuy lifeBuy);

    /**
     * 修改生活日常消费
     * 
     * @param lifeBuy 生活日常消费
     * @return 结果
     */
    public int updateLifeBuy(LifeBuy lifeBuy);

    /**
     * 批量删除生活日常消费
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLifeBuyByIds(String ids);

    /**
     * 删除生活日常消费信息
     * 
     * @param id 生活日常消费ID
     * @return 结果
     */
    public int deleteLifeBuyById(Long id);
}
