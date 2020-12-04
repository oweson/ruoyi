package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Delisting;

/**
 * 恋爱之路Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-04
 */
public interface DelistingMapper 
{
    /**
     * 查询恋爱之路
     * 
     * @param id 恋爱之路ID
     * @return 恋爱之路
     */
    public Delisting selectDelistingById(Long id);

    /**
     * 查询恋爱之路列表
     * 
     * @param delisting 恋爱之路
     * @return 恋爱之路集合
     */
    public List<Delisting> selectDelistingList(Delisting delisting);

    /**
     * 新增恋爱之路
     * 
     * @param delisting 恋爱之路
     * @return 结果
     */
    public int insertDelisting(Delisting delisting);

    /**
     * 修改恋爱之路
     * 
     * @param delisting 恋爱之路
     * @return 结果
     */
    public int updateDelisting(Delisting delisting);

    /**
     * 删除恋爱之路
     * 
     * @param id 恋爱之路ID
     * @return 结果
     */
    public int deleteDelistingById(Long id);

    /**
     * 批量删除恋爱之路
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDelistingByIds(String[] ids);
}
