package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OfferCityMapper;
import com.ruoyi.system.domain.OfferCity;
import com.ruoyi.system.service.IOfferCityService;
import com.ruoyi.common.core.text.Convert;

/**
 * 求职Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-04-22
 */
@Service
public class OfferCityServiceImpl implements IOfferCityService 
{
    @Autowired
    private OfferCityMapper offerCityMapper;

    /**
     * 查询求职
     * 
     * @param id 求职ID
     * @return 求职
     */
    @Override
    public OfferCity selectOfferCityById(Long id)
    {
        return offerCityMapper.selectOfferCityById(id);
    }

    /**
     * 查询求职列表
     * 
     * @param offerCity 求职
     * @return 求职
     */
    @Override
    public List<OfferCity> selectOfferCityList(OfferCity offerCity)
    {
        return offerCityMapper.selectOfferCityList(offerCity);
    }

    /**
     * 新增求职
     * 
     * @param offerCity 求职
     * @return 结果
     */
    @Override
    public int insertOfferCity(OfferCity offerCity)
    {
        offerCity.setCreateTime(DateUtils.getNowDate());
        return offerCityMapper.insertOfferCity(offerCity);
    }

    /**
     * 修改求职
     * 
     * @param offerCity 求职
     * @return 结果
     */
    @Override
    public int updateOfferCity(OfferCity offerCity)
    {
        return offerCityMapper.updateOfferCity(offerCity);
    }

    /**
     * 删除求职对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOfferCityByIds(String ids)
    {
        return offerCityMapper.deleteOfferCityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除求职信息
     * 
     * @param id 求职ID
     * @return 结果
     */
    @Override
    public int deleteOfferCityById(Long id)
    {
        return offerCityMapper.deleteOfferCityById(id);
    }
}
