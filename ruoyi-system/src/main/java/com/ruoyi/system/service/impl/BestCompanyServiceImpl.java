package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BestCompanyMapper;
import com.ruoyi.system.domain.BestCompany;
import com.ruoyi.system.service.IBestCompanyService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优秀公司关注Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-13
 */
@Service
public class BestCompanyServiceImpl implements IBestCompanyService 
{
    @Autowired
    private BestCompanyMapper bestCompanyMapper;

    /**
     * 查询优秀公司关注
     * 
     * @param id 优秀公司关注ID
     * @return 优秀公司关注
     */
    @Override
    public BestCompany selectBestCompanyById(Integer id)
    {
        return bestCompanyMapper.selectBestCompanyById(id);
    }

    /**
     * 查询优秀公司关注列表
     * 
     * @param bestCompany 优秀公司关注
     * @return 优秀公司关注
     */
    @Override
    public List<BestCompany> selectBestCompanyList(BestCompany bestCompany)
    {
        return bestCompanyMapper.selectBestCompanyList(bestCompany);
    }

    /**
     * 新增优秀公司关注
     * 
     * @param bestCompany 优秀公司关注
     * @return 结果
     */
    @Override
    public int insertBestCompany(BestCompany bestCompany)
    {
        bestCompany.setCreateTime(DateUtils.getNowDate());
        return bestCompanyMapper.insertBestCompany(bestCompany);
    }

    /**
     * 修改优秀公司关注
     * 
     * @param bestCompany 优秀公司关注
     * @return 结果
     */
    @Override
    public int updateBestCompany(BestCompany bestCompany)
    {
        bestCompany.setUpdateTime(DateUtils.getNowDate());
        return bestCompanyMapper.updateBestCompany(bestCompany);
    }

    /**
     * 删除优秀公司关注对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBestCompanyByIds(String ids)
    {
        return bestCompanyMapper.deleteBestCompanyByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优秀公司关注信息
     * 
     * @param id 优秀公司关注ID
     * @return 结果
     */
    @Override
    public int deleteBestCompanyById(Integer id)
    {
        return bestCompanyMapper.deleteBestCompanyById(id);
    }
}
