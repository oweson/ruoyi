package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TravelMapper;
import com.ruoyi.system.domain.Travel;
import com.ruoyi.system.service.ITravelService;
import com.ruoyi.common.core.text.Convert;

/**
 * 旅游Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-12
 */
@Service
public class TravelServiceImpl implements ITravelService 
{
    @Autowired
    private TravelMapper travelMapper;

    /**
     * 查询旅游
     * 
     * @param id 旅游ID
     * @return 旅游
     */
    @Override
    public Travel selectTravelById(Long id)
    {
        return travelMapper.selectTravelById(id);
    }

    /**
     * 查询旅游列表
     * 
     * @param travel 旅游
     * @return 旅游
     */
    @Override
    public List<Travel> selectTravelList(Travel travel)
    {
        return travelMapper.selectTravelList(travel);
    }

    /**
     * 新增旅游
     * 
     * @param travel 旅游
     * @return 结果
     */
    @Override
    public int insertTravel(Travel travel)
    {
        travel.setCreateTime(DateUtils.getNowDate());
        return travelMapper.insertTravel(travel);
    }

    /**
     * 修改旅游
     * 
     * @param travel 旅游
     * @return 结果
     */
    @Override
    public int updateTravel(Travel travel)
    {
        travel.setUpdateTime(DateUtils.getNowDate());
        return travelMapper.updateTravel(travel);
    }

    /**
     * 删除旅游对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTravelByIds(String ids)
    {
        return travelMapper.deleteTravelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除旅游信息
     * 
     * @param id 旅游ID
     * @return 结果
     */
    @Override
    public int deleteTravelById(Long id)
    {
        return travelMapper.deleteTravelById(id);
    }
}
