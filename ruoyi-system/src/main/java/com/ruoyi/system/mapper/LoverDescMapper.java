package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LoverDesc;

/**
 * 求偶标准Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-04
 */
public interface LoverDescMapper 
{
    /**
     * 查询求偶标准
     * 
     * @param id 求偶标准ID
     * @return 求偶标准
     */
    public LoverDesc selectLoverDescById(Long id);

    /**
     * 查询求偶标准列表
     * 
     * @param loverDesc 求偶标准
     * @return 求偶标准集合
     */
    public List<LoverDesc> selectLoverDescList(LoverDesc loverDesc);

    /**
     * 新增求偶标准
     * 
     * @param loverDesc 求偶标准
     * @return 结果
     */
    public int insertLoverDesc(LoverDesc loverDesc);

    /**
     * 修改求偶标准
     * 
     * @param loverDesc 求偶标准
     * @return 结果
     */
    public int updateLoverDesc(LoverDesc loverDesc);

    /**
     * 删除求偶标准
     * 
     * @param id 求偶标准ID
     * @return 结果
     */
    public int deleteLoverDescById(Long id);

    /**
     * 批量删除求偶标准
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLoverDescByIds(String[] ids);
}
