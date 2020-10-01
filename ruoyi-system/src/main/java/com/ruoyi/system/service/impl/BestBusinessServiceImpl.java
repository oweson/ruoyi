package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BestBusinessMapper;
import com.ruoyi.system.domain.BestBusiness;
import com.ruoyi.system.service.IBestBusinessService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优秀公司关注Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class BestBusinessServiceImpl implements IBestBusinessService 
{
    @Autowired
    private BestBusinessMapper bestBusinessMapper;

    /**
     * 查询优秀公司关注
     * 
     * @param id 优秀公司关注ID
     * @return 优秀公司关注
     */
    @Override
    public BestBusiness selectBestBusinessById(Integer id)
    {
        return bestBusinessMapper.selectBestBusinessById(id);
    }

    /**
     * 查询优秀公司关注列表
     * 
     * @param bestBusiness 优秀公司关注
     * @return 优秀公司关注
     */
    @Override
    public List<BestBusiness> selectBestBusinessList(BestBusiness bestBusiness)
    {
        return bestBusinessMapper.selectBestBusinessList(bestBusiness);
    }

    /**
     * 新增优秀公司关注
     * 
     * @param bestBusiness 优秀公司关注
     * @return 结果
     */
    @Override
    public int insertBestBusiness(BestBusiness bestBusiness)
    {
        bestBusiness.setCreateTime(DateUtils.getNowDate());
        return bestBusinessMapper.insertBestBusiness(bestBusiness);
    }

    /**
     * 修改优秀公司关注
     * 
     * @param bestBusiness 优秀公司关注
     * @return 结果
     */
    @Override
    public int updateBestBusiness(BestBusiness bestBusiness)
    {
        bestBusiness.setUpdateTime(DateUtils.getNowDate());
        return bestBusinessMapper.updateBestBusiness(bestBusiness);
    }

    /**
     * 删除优秀公司关注对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBestBusinessByIds(String ids)
    {
        return bestBusinessMapper.deleteBestBusinessByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优秀公司关注信息
     * 
     * @param id 优秀公司关注ID
     * @return 结果
     */
    @Override
    public int deleteBestBusinessById(Integer id)
    {
        return bestBusinessMapper.deleteBestBusinessById(id);
    }
}
