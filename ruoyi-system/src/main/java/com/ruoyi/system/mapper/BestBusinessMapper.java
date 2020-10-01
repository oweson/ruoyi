package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.BestBusiness;

/**
 * 优秀公司关注Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface BestBusinessMapper 
{
    /**
     * 查询优秀公司关注
     * 
     * @param id 优秀公司关注ID
     * @return 优秀公司关注
     */
    public BestBusiness selectBestBusinessById(Integer id);

    /**
     * 查询优秀公司关注列表
     * 
     * @param bestBusiness 优秀公司关注
     * @return 优秀公司关注集合
     */
    public List<BestBusiness> selectBestBusinessList(BestBusiness bestBusiness);

    /**
     * 新增优秀公司关注
     * 
     * @param bestBusiness 优秀公司关注
     * @return 结果
     */
    public int insertBestBusiness(BestBusiness bestBusiness);

    /**
     * 修改优秀公司关注
     * 
     * @param bestBusiness 优秀公司关注
     * @return 结果
     */
    public int updateBestBusiness(BestBusiness bestBusiness);

    /**
     * 删除优秀公司关注
     * 
     * @param id 优秀公司关注ID
     * @return 结果
     */
    public int deleteBestBusinessById(Integer id);

    /**
     * 批量删除优秀公司关注
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBestBusinessByIds(String[] ids);
}
