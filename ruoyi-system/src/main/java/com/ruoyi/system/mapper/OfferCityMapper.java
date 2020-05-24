package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OfferCity;

/**
 * 求职Mapper接口
 * 
 * @author ruoyi
 * @date 2020-04-22
 */
public interface OfferCityMapper 
{
    /**
     * 查询求职
     * 
     * @param id 求职ID
     * @return 求职
     */
    public OfferCity selectOfferCityById(Long id);

    /**
     * 查询求职列表
     * 
     * @param offerCity 求职
     * @return 求职集合
     */
    public List<OfferCity> selectOfferCityList(OfferCity offerCity);

    /**
     * 新增求职
     * 
     * @param offerCity 求职
     * @return 结果
     */
    public int insertOfferCity(OfferCity offerCity);

    /**
     * 修改求职
     * 
     * @param offerCity 求职
     * @return 结果
     */
    public int updateOfferCity(OfferCity offerCity);

    /**
     * 删除求职
     * 
     * @param id 求职ID
     * @return 结果
     */
    public int deleteOfferCityById(Long id);

    /**
     * 批量删除求职
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOfferCityByIds(String[] ids);
}
