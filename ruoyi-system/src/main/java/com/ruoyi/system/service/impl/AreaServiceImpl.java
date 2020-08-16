package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AreaMapper;
import com.ruoyi.system.domain.Area;
import com.ruoyi.system.service.IAreaService;
import com.ruoyi.common.core.text.Convert;

/**
 * 国家地区Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
@Service
public class AreaServiceImpl implements IAreaService 
{
    @Autowired
    private AreaMapper areaMapper;

    /**
     * 查询国家地区
     * 
     * @param areaId 国家地区ID
     * @return 国家地区
     */
    @Override
    public Area selectAreaById(Long areaId)
    {
        return areaMapper.selectAreaById(areaId);
    }

    /**
     * 查询国家地区列表
     * 
     * @param area 国家地区
     * @return 国家地区
     */
    @Override
    public List<Area> selectAreaList(Area area)
    {
        return areaMapper.selectAreaList(area);
    }

    /**
     * 新增国家地区
     * 
     * @param area 国家地区
     * @return 结果
     */
    @Override
    public int insertArea(Area area)
    {
        return areaMapper.insertArea(area);
    }

    /**
     * 修改国家地区
     * 
     * @param area 国家地区
     * @return 结果
     */
    @Override
    public int updateArea(Area area)
    {
        return areaMapper.updateArea(area);
    }

    /**
     * 删除国家地区对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAreaByIds(String ids)
    {
        return areaMapper.deleteAreaByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除国家地区信息
     * 
     * @param areaId 国家地区ID
     * @return 结果
     */
    @Override
    public int deleteAreaById(Long areaId)
    {
        return areaMapper.deleteAreaById(areaId);
    }
}
