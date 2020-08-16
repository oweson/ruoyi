package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Area;

/**
 * 国家地区Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-15
 */
public interface AreaMapper 
{
    /**
     * 查询国家地区
     * 
     * @param areaId 国家地区ID
     * @return 国家地区
     */
    public Area selectAreaById(Long areaId);

    /**
     * 查询国家地区列表
     * 
     * @param area 国家地区
     * @return 国家地区集合
     */
    public List<Area> selectAreaList(Area area);

    /**
     * 新增国家地区
     * 
     * @param area 国家地区
     * @return 结果
     */
    public int insertArea(Area area);

    /**
     * 修改国家地区
     * 
     * @param area 国家地区
     * @return 结果
     */
    public int updateArea(Area area);

    /**
     * 删除国家地区
     * 
     * @param areaId 国家地区ID
     * @return 结果
     */
    public int deleteAreaById(Long areaId);

    /**
     * 批量删除国家地区
     * 
     * @param areaIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteAreaByIds(String[] areaIds);
}
